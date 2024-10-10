/* eslint-disable import/prefer-default-export */
import { NextResponse, NextRequest } from 'next/server'
import { fetchOrderDetail } from '@/libs/order'
import { fetchOwnerInformation } from '@/libs/user'

// 사장 정보 조회 API
export async function GET(req: NextRequest) {
  try {
    const ownerInfoResponse = await fetchOwnerInformation()

    if (!ownerInfoResponse.ok) {
      const errorMessage = await ownerInfoResponse.text()
      return NextResponse.json(
        { error: errorMessage },
        { status: ownerInfoResponse.status }
      )
    }

    const ownerInfoData = await ownerInfoResponse.json()

    return NextResponse.json(ownerInfoData.data)
  } catch (error: unknown) {
    let errorMessage = '서버 에러가 발생했습니다.'
    let errorStatus = 500

    if (error instanceof Error) {
      const parsedError = JSON.parse(error.message)
      errorMessage = parsedError.message || errorMessage
      errorStatus = parsedError.status || errorStatus
    } else if (typeof error === 'string') {
      errorMessage = error
    } else if (typeof error === 'object' && error !== null) {
      errorMessage = JSON.stringify(error)
    }

    // throw new Error(errorData.error || 'Unknown error occurred');
    return NextResponse.json({ error: errorMessage }, { status: errorStatus })
  }
}
