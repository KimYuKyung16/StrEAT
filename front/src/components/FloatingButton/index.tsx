import Link from 'next/link'
import { GoPlus } from 'react-icons/go'

export default function FloatingButton({
  href = '',
  icon = <GoPlus className="text-secondary-light w-9 h-9" />,
}: {
  href: string
  icon: JSX.Element
}) {
  return (
    <Link href={href}>
      <button
        type="button"
        className="fixed bottom-24 right-6 flex justify-center items-center rounded-full bg-primary-500 w-20 aspect-square"
      >
        {icon}
      </button>
    </Link>
  )
}
