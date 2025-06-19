package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.VehicleCab: ImageVector
    get() {
        if (_VehicleCab != null) {
            return _VehicleCab!!
        }
        _VehicleCab = ImageVector.Builder(
            name = "Filled.VehicleCab",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.266f, 1.992f)
                curveTo(8.851f, 1.992f, 8.516f, 2.328f, 8.516f, 2.742f)
                verticalLineTo(4.5f)
                horizontalLineTo(7.852f)
                curveTo(6.422f, 4.5f, 5.16f, 5.435f, 4.743f, 6.802f)
                lineTo(4.683f, 7f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 7f, 3f, 7.336f, 3f, 7.75f)
                curveTo(3f, 8.164f, 3.336f, 8.5f, 3.75f, 8.5f)
                horizontalLineTo(4.283f)
                lineTo(4.081f, 9.327f)
                curveTo(3.433f, 9.722f, 3f, 10.435f, 3f, 11.25f)
                verticalLineTo(19.75f)
                curveTo(3f, 20.716f, 3.783f, 21.5f, 4.75f, 21.5f)
                horizontalLineTo(6.25f)
                curveTo(7.216f, 21.5f, 8f, 20.716f, 8f, 19.75f)
                verticalLineTo(18.5f)
                horizontalLineTo(16f)
                verticalLineTo(19.75f)
                curveTo(16f, 20.716f, 16.784f, 21.5f, 17.75f, 21.5f)
                horizontalLineTo(19.25f)
                curveTo(20.216f, 21.5f, 21f, 20.716f, 21f, 19.75f)
                verticalLineTo(11.25f)
                curveTo(21f, 10.435f, 20.566f, 9.721f, 19.917f, 9.326f)
                lineTo(19.711f, 8.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 8.5f, 21f, 8.164f, 21f, 7.75f)
                curveTo(21f, 7.336f, 20.664f, 7f, 20.25f, 7f)
                horizontalLineTo(19.308f)
                lineTo(19.253f, 6.816f)
                curveTo(18.84f, 5.441f, 17.575f, 4.5f, 16.14f, 4.5f)
                horizontalLineTo(15.484f)
                verticalLineTo(2.742f)
                curveTo(15.484f, 2.328f, 15.149f, 1.992f, 14.734f, 1.992f)
                horizontalLineTo(9.266f)
                close()
                moveTo(7.852f, 6f)
                horizontalLineTo(16.14f)
                curveTo(16.913f, 6f, 17.594f, 6.507f, 17.816f, 7.247f)
                lineTo(18.027f, 7.949f)
                lineTo(18.289f, 9f)
                horizontalLineTo(5.705f)
                lineTo(5.962f, 7.948f)
                lineTo(6.178f, 7.24f)
                curveTo(6.402f, 6.503f, 7.082f, 6f, 7.852f, 6f)
                close()
                moveTo(4.5f, 18.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(19.75f)
                curveTo(6.5f, 19.888f, 6.388f, 20f, 6.25f, 20f)
                horizontalLineTo(4.75f)
                curveTo(4.612f, 20f, 4.5f, 19.888f, 4.5f, 19.75f)
                verticalLineTo(18.5f)
                close()
                moveTo(17.5f, 18.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(19.75f)
                curveTo(19.5f, 19.888f, 19.388f, 20f, 19.25f, 20f)
                horizontalLineTo(17.75f)
                curveTo(17.612f, 20f, 17.5f, 19.888f, 17.5f, 19.75f)
                verticalLineTo(18.5f)
                close()
                moveTo(8.005f, 13f)
                curveTo(8.005f, 13.552f, 7.558f, 14f, 7.005f, 14f)
                curveTo(6.453f, 14f, 6.005f, 13.552f, 6.005f, 13f)
                curveTo(6.005f, 12.448f, 6.453f, 12f, 7.005f, 12f)
                curveTo(7.558f, 12f, 8.005f, 12.448f, 8.005f, 13f)
                close()
                moveTo(17f, 14f)
                curveTo(16.448f, 14f, 16f, 13.552f, 16f, 13f)
                curveTo(16f, 12.448f, 16.448f, 12f, 17f, 12f)
                curveTo(17.552f, 12f, 18f, 12.448f, 18f, 13f)
                curveTo(18f, 13.552f, 17.552f, 14f, 17f, 14f)
                close()
            }
        }.build()

        return _VehicleCab!!
    }

@Suppress("ObjectPropertyName")
private var _VehicleCab: ImageVector? = null

@Preview
@Composable
private fun VehicleCabPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VehicleCab, contentDescription = null)
    }
}
