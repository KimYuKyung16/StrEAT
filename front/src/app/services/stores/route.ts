import { NextResponse } from 'next/server'

// eslint-disable-next-line import/prefer-default-export
export async function GET(request: Request) {
  const { searchParams } = new URL(request.url)

  const lat = searchParams.get('lat')
  const lng = searchParams.get('lng')

  try {
    const response = await fetch(
      `https://j11a307.p.ssafy.io/api/stores/nearby?latitude=${lat}&longitude=${lng}&page=0&size=20`
    )

    if (!response.ok) {
      return NextResponse.json(
        { message: 'Failed to fetch store list' },
        { status: response.status }
      )
    }

    const data = await response.json()
    return NextResponse.json(data, { status: 200 })
  } catch (error) {
    console.error('Error fetching store list:', error)
    return NextResponse.json(
      { message: 'Internal Server Error' },
      { status: 500 }
    )
  }
}
