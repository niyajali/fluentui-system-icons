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

public val FluentIcons.Filled.ReceiptCube: ImageVector
    get() {
        if (_ReceiptCube != null) {
            return _ReceiptCube!!
        }
        _ReceiptCube = ImageVector.Builder(
            name = "Filled.ReceiptCube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 5.25f)
                curveTo(4f, 4.007f, 5.007f, 3f, 6.25f, 3f)
                horizontalLineTo(15.75f)
                curveTo(16.993f, 3f, 18f, 4.007f, 18f, 5.25f)
                verticalLineTo(14f)
                horizontalLineTo(22f)
                verticalLineTo(17.75f)
                curveTo(22f, 19.545f, 20.545f, 21f, 18.75f, 21f)
                horizontalLineTo(11.667f)
                curveTo(11.881f, 20.628f, 12f, 20.199f, 12f, 19.753f)
                verticalLineTo(15.25f)
                curveTo(12f, 14.303f, 11.465f, 13.437f, 10.618f, 13.014f)
                lineTo(9.59f, 12.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 12.5f, 14.5f, 12.164f, 14.5f, 11.75f)
                curveTo(14.5f, 11.336f, 14.164f, 11f, 13.75f, 11f)
                horizontalLineTo(8.25f)
                curveTo(7.931f, 11f, 7.658f, 11.199f, 7.55f, 11.48f)
                lineTo(7.118f, 11.264f)
                curveTo(6.414f, 10.912f, 5.586f, 10.912f, 4.882f, 11.264f)
                lineTo(4f, 11.705f)
                verticalLineTo(5.25f)
                close()
                moveTo(18f, 19.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 19.5f, 20.5f, 18.716f, 20.5f, 17.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(18f)
                verticalLineTo(19.5f)
                close()
                moveTo(7.5f, 7.75f)
                curveTo(7.5f, 8.164f, 7.836f, 8.5f, 8.25f, 8.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 8.5f, 14.5f, 8.164f, 14.5f, 7.75f)
                curveTo(14.5f, 7.336f, 14.164f, 7f, 13.75f, 7f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 7f, 7.5f, 7.336f, 7.5f, 7.75f)
                close()
                moveTo(10.171f, 13.908f)
                lineTo(6.671f, 12.158f)
                curveTo(6.249f, 11.947f, 5.751f, 11.947f, 5.329f, 12.158f)
                lineTo(1.829f, 13.908f)
                curveTo(1.321f, 14.162f, 1f, 14.682f, 1f, 15.25f)
                verticalLineTo(19.753f)
                curveTo(1f, 20.321f, 1.321f, 20.84f, 1.829f, 21.095f)
                lineTo(5.329f, 22.845f)
                curveTo(5.751f, 23.056f, 6.249f, 23.056f, 6.671f, 22.845f)
                lineTo(10.171f, 21.095f)
                curveTo(10.679f, 20.84f, 11f, 20.321f, 11f, 19.753f)
                verticalLineTo(15.25f)
                curveTo(11f, 14.682f, 10.679f, 14.162f, 10.171f, 13.908f)
                close()
                moveTo(2.553f, 15.276f)
                curveTo(2.676f, 15.029f, 2.977f, 14.929f, 3.224f, 15.053f)
                lineTo(6f, 16.441f)
                lineTo(8.776f, 15.053f)
                curveTo(9.023f, 14.929f, 9.324f, 15.029f, 9.447f, 15.276f)
                curveTo(9.571f, 15.523f, 9.471f, 15.824f, 9.224f, 15.947f)
                lineTo(6.5f, 17.309f)
                verticalLineTo(20.5f)
                curveTo(6.5f, 20.776f, 6.276f, 21f, 6f, 21f)
                curveTo(5.724f, 21f, 5.5f, 20.776f, 5.5f, 20.5f)
                verticalLineTo(17.309f)
                lineTo(2.776f, 15.947f)
                curveTo(2.529f, 15.824f, 2.429f, 15.523f, 2.553f, 15.276f)
                close()
            }
        }.build()

        return _ReceiptCube!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptCube: ImageVector? = null

@Preview
@Composable
private fun ReceiptCubePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ReceiptCube, contentDescription = null)
    }
}
