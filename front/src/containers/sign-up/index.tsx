'use client'

import { useState } from 'react'
import { PiChefHat, PiForkKnife } from 'react-icons/pi'
import { LuMoveRight } from 'react-icons/lu'
import Link from 'next/link'

export default function SignUp() {
  const [selectedRole, setSelectedRole] = useState<'owner' | 'customer' | null>(
    null
  )

  return (
    <div className="h-screen flex flex-col items-center justify-center space-y-10">
      <h1 className="text-5xl font-bold">StrEAT</h1>
      <p className="font-xl font-medium">어떤 회원으로 가입할까요?</p>
      <div className="flex space-x-4">
        {/* 사장님 버튼 */}
        <button
          className={`border size-40 rounded-lg flex flex-col space-y-2 items-center justify-center transition-colors ${
            selectedRole === 'owner'
              ? 'bg-primary-500 text-white'
              : 'border-primary-500 text-primary-500'
          }`}
          onClick={() => setSelectedRole('owner')}
        >
          <PiChefHat size={48} />
          <p>사장님</p>
        </button>

        {/* 손님 버튼 */}
        <button
          className={`border size-40 rounded-lg flex flex-col space-y-2 items-center justify-center transition-colors ${
            selectedRole === 'customer'
              ? 'bg-primary-500 text-white'
              : 'border-primary-500 text-primary-500'
          }`}
          onClick={() => setSelectedRole('customer')}
        >
          <PiForkKnife size={48} />
          <p>손님</p>
        </button>
      </div>
      {/* 임시 Link */}
      <Link href="/customer">
        <LuMoveRight
          size={48}
          className={`fixed bottom-6 right-6 transition-colors ${
            selectedRole ? 'text-primary-950' : 'text-gray-medium'
          }`}
        />
      </Link>
    </div>
  )
}
