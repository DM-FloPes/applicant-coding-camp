package dm.applicantcodingcamp.bikerental.model

data class Bike(
    var manufacturer: String? = null,
    var rimSize: Int = 0,
    var frameSize: Int = 0,
    var color: String? = null,
    var rented: Boolean = false,
) {
    override fun toString(): String {
        return "Bike{" + manufacturer +
            ", rimSize=" + rimSize +
            ", frameSize=" + frameSize +
            ", color=" + color +
            ", rented=" + rented +
            '}'
    }
}
