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

public val FluentIcons.Regular.HdOff: ImageVector
    get() {
        if (_HdOff != null) {
            return _HdOff!!
        }
        _HdOff = ImageVector.Builder(
            name = "Regular.HdOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.227f, 2.227f)
                curveTo(1.934f, 2.519f, 1.934f, 2.994f, 2.227f, 3.287f)
                lineTo(3.483f, 4.544f)
                curveTo(3.177f, 5.04f, 3f, 5.624f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(18.376f, 21f, 18.96f, 20.823f, 19.456f, 20.517f)
                lineTo(20.724f, 21.785f)
                curveTo(21.017f, 22.078f, 21.492f, 22.078f, 21.785f, 21.785f)
                curveTo(22.078f, 21.492f, 22.078f, 21.017f, 21.785f, 20.725f)
                lineTo(3.287f, 2.227f)
                curveTo(2.994f, 1.934f, 2.519f, 1.934f, 2.227f, 2.227f)
                close()
                moveTo(18.338f, 19.399f)
                curveTo(18.154f, 19.464f, 17.956f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 6.044f, 4.536f, 5.846f, 4.601f, 5.662f)
                lineTo(6.987f, 8.048f)
                curveTo(6.702f, 8.154f, 6.5f, 8.428f, 6.5f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(6.5f, 15.664f, 6.836f, 16f, 7.25f, 16f)
                curveTo(7.664f, 16f, 8f, 15.664f, 8f, 15.25f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(15.25f)
                curveTo(10f, 15.664f, 10.336f, 16f, 10.75f, 16f)
                curveTo(11.164f, 16f, 11.5f, 15.664f, 11.5f, 15.25f)
                verticalLineTo(12.561f)
                lineTo(13f, 14.061f)
                verticalLineTo(15.25f)
                curveTo(13f, 15.664f, 13.336f, 16f, 13.75f, 16f)
                horizontalLineTo(14.75f)
                curveTo(14.812f, 16f, 14.873f, 15.998f, 14.934f, 15.995f)
                lineTo(18.338f, 19.399f)
                close()
                moveTo(8f, 9.061f)
                lineTo(10f, 11.061f)
                verticalLineTo(11.5f)
                horizontalLineTo(8f)
                verticalLineTo(9.061f)
                close()
                moveTo(18f, 12.75f)
                curveTo(18f, 13.345f, 17.84f, 13.902f, 17.561f, 14.382f)
                lineTo(16.428f, 13.248f)
                curveTo(16.475f, 13.09f, 16.5f, 12.923f, 16.5f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(16.5f, 10.283f, 15.717f, 9.5f, 14.75f, 9.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(11.32f)
                lineTo(13f, 9.82f)
                verticalLineTo(8.75f)
                curveTo(13f, 8.336f, 13.336f, 8f, 13.75f, 8f)
                horizontalLineTo(14.75f)
                curveTo(16.545f, 8f, 18f, 9.455f, 18f, 11.25f)
                verticalLineTo(12.75f)
                close()
                moveTo(19.5f, 6.25f)
                verticalLineTo(16.32f)
                lineTo(20.999f, 17.819f)
                curveTo(21f, 17.796f, 21f, 17.773f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                curveTo(6.227f, 3f, 6.204f, 3f, 6.181f, 3.001f)
                lineTo(7.68f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                close()
            }
        }.build()

        return _HdOff!!
    }

@Suppress("ObjectPropertyName")
private var _HdOff: ImageVector? = null

@Preview
@Composable
private fun HdOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HdOff, contentDescription = null)
    }
}
