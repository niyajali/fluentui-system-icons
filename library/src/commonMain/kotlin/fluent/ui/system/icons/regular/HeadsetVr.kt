package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.HeadsetVr: ImageVector
    get() {
        if (_HeadsetVr != null) {
            return _HeadsetVr!!
        }
        _HeadsetVr = ImageVector.Builder(
            name = "Regular.HeadsetVr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13f, 9f)
                curveTo(13f, 9.552f, 12.552f, 10f, 12f, 10f)
                curveTo(11.448f, 10f, 11f, 9.552f, 11f, 9f)
                curveTo(11f, 8.448f, 11.448f, 8f, 12f, 8f)
                curveTo(12.552f, 8f, 13f, 8.448f, 13f, 9f)
                close()
                moveTo(6.75f, 11.5f)
                curveTo(6.336f, 11.5f, 6f, 11.836f, 6f, 12.25f)
                curveTo(6f, 12.664f, 6.336f, 13f, 6.75f, 13f)
                horizontalLineTo(9.25f)
                curveTo(9.664f, 13f, 10f, 12.664f, 10f, 12.25f)
                curveTo(10f, 11.836f, 9.664f, 11.5f, 9.25f, 11.5f)
                horizontalLineTo(6.75f)
                close()
                moveTo(14f, 12.25f)
                curveTo(14f, 11.836f, 14.336f, 11.5f, 14.75f, 11.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 11.5f, 18f, 11.836f, 18f, 12.25f)
                curveTo(18f, 12.664f, 17.664f, 13f, 17.25f, 13f)
                horizontalLineTo(14.75f)
                curveTo(14.336f, 13f, 14f, 12.664f, 14f, 12.25f)
                close()
                moveTo(9.75f, 3f)
                curveTo(9.336f, 3f, 9f, 3.336f, 9f, 3.75f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                curveTo(3.791f, 5f, 2f, 6.791f, 2f, 9f)
                horizontalLineTo(1.75f)
                curveTo(1.336f, 9f, 1f, 9.336f, 1f, 9.75f)
                verticalLineTo(13.25f)
                curveTo(1f, 13.664f, 1.336f, 14f, 1.75f, 14f)
                horizontalLineTo(2f)
                verticalLineTo(16.5f)
                curveTo(2f, 18.709f, 3.791f, 20.5f, 6f, 20.5f)
                horizontalLineTo(7.545f)
                curveTo(8.312f, 20.5f, 9.063f, 20.279f, 9.708f, 19.865f)
                lineTo(11.865f, 18.479f)
                curveTo(11.947f, 18.426f, 12.053f, 18.426f, 12.135f, 18.479f)
                lineTo(14.292f, 19.865f)
                curveTo(14.937f, 20.279f, 15.688f, 20.5f, 16.455f, 20.5f)
                horizontalLineTo(18f)
                curveTo(20.209f, 20.5f, 22f, 18.709f, 22f, 16.5f)
                verticalLineTo(14f)
                horizontalLineTo(22.25f)
                curveTo(22.664f, 14f, 23f, 13.664f, 23f, 13.25f)
                verticalLineTo(9.75f)
                curveTo(23f, 9.336f, 22.664f, 9f, 22.25f, 9f)
                horizontalLineTo(22f)
                curveTo(22f, 6.791f, 20.209f, 5f, 18f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(3.75f)
                curveTo(15f, 3.336f, 14.664f, 3f, 14.25f, 3f)
                horizontalLineTo(9.75f)
                close()
                moveTo(6f, 6.5f)
                horizontalLineTo(18f)
                curveTo(19.381f, 6.5f, 20.5f, 7.619f, 20.5f, 9f)
                verticalLineTo(16.5f)
                curveTo(20.5f, 17.881f, 19.381f, 19f, 18f, 19f)
                horizontalLineTo(16.455f)
                curveTo(15.975f, 19f, 15.506f, 18.862f, 15.103f, 18.603f)
                lineTo(12.946f, 17.217f)
                curveTo(12.37f, 16.846f, 11.63f, 16.846f, 11.054f, 17.217f)
                lineTo(8.897f, 18.603f)
                curveTo(8.494f, 18.862f, 8.025f, 19f, 7.545f, 19f)
                horizontalLineTo(6f)
                curveTo(4.619f, 19f, 3.5f, 17.881f, 3.5f, 16.5f)
                verticalLineTo(9f)
                curveTo(3.5f, 7.619f, 4.619f, 6.5f, 6f, 6.5f)
                close()
            }
        }.build()

        return _HeadsetVr!!
    }

@Suppress("ObjectPropertyName")
private var _HeadsetVr: ImageVector? = null

@Preview
@Composable
private fun HeadsetVrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HeadsetVr, contentDescription = null)
    }
}
