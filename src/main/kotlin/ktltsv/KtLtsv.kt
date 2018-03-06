package ktltsv

fun ltsv(vararg pairs: Pair<Any?, Any?>) = ltsv(pairs as Iterable<Pair<Any?, Any?>>)

fun ltsv(pairs: Iterable<Pair<Any?, Any?>>) =
        pairs.joinToString("\t") { (k, v) -> "${k?.toString() ?: ""}:${v?.toString() ?: ""}" }

fun Iterable<Pair<Any?, Any?>>.toLtsv() = ltsv(this)

fun Map<Any?, Any?>.toLtsv() = this.entries.map { Pair(it.key, it.value) }.toLtsv()
