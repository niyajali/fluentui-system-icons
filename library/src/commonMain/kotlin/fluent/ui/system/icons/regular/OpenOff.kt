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

public val FluentIcons.Regular.OpenOff: ImageVector
    get() {
        if (_OpenOff != null) {
            return _OpenOff!!
        }
        _OpenOff = ImageVector.Builder(
            name = "Regular.OpenOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                lineTo(21.78f, 20.72f)
                curveTo(22.073f, 21.013f, 22.073f, 21.488f, 21.78f, 21.781f)
                curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.781f)
                lineTo(19.456f, 20.517f)
                curveTo(18.96f, 20.823f, 18.375f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 5.624f, 3.177f, 5.04f, 3.483f, 4.544f)
                lineTo(2.22f, 3.28f)
                curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
                curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
                close()
                moveTo(18.338f, 19.399f)
                lineTo(4.601f, 5.662f)
                curveTo(4.536f, 5.846f, 4.5f, 6.044f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.283f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(17.956f, 19.5f, 18.154f, 19.464f, 18.338f, 19.399f)
                close()
                moveTo(13.085f, 9.903f)
                lineTo(14.097f, 10.915f)
                curveTo(14.163f, 10.881f, 14.225f, 10.836f, 14.28f, 10.78f)
                lineTo(19.5f, 5.561f)
                verticalLineTo(10.25f)
                curveTo(19.5f, 10.664f, 19.836f, 11f, 20.25f, 11f)
                curveTo(20.664f, 11f, 21f, 10.664f, 21f, 10.25f)
                verticalLineTo(3.75f)
                curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
                horizontalLineTo(13.75f)
                curveTo(13.335f, 3f, 13f, 3.336f, 13f, 3.75f)
                curveTo(13f, 4.164f, 13.335f, 4.5f, 13.75f, 4.5f)
                horizontalLineTo(18.44f)
                lineTo(13.219f, 9.72f)
                curveTo(13.164f, 9.775f, 13.119f, 9.837f, 13.085f, 9.903f)
                close()
                moveTo(20.999f, 17.817f)
                lineTo(19.5f, 16.318f)
                verticalLineTo(13.75f)
                curveTo(19.5f, 13.336f, 19.835f, 13f, 20.25f, 13f)
                curveTo(20.664f, 13f, 21f, 13.336f, 21f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(21f, 17.772f, 20.999f, 17.795f, 20.999f, 17.817f)
                close()
                moveTo(6.183f, 3.001f)
                lineTo(7.682f, 4.5f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 4.5f, 11f, 4.164f, 11f, 3.75f)
                curveTo(11f, 3.336f, 10.664f, 3f, 10.25f, 3f)
                horizontalLineTo(6.25f)
                curveTo(6.227f, 3f, 6.205f, 3f, 6.183f, 3.001f)
                close()
            }
        }.build()

        return _OpenOff!!
    }

@Suppress("ObjectPropertyName")
private var _OpenOff: ImageVector? = null

@Preview
@Composable
private fun OpenOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.OpenOff, contentDescription = null)
    }
}
