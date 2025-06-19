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

public val FluentIcons.Filled.Midi: ImageVector
    get() {
        if (_Midi != null) {
            return _Midi!!
        }
        _Midi = ImageVector.Builder(
            name = "Filled.Midi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.25f, 4.004f)
                curveTo(21.63f, 4.004f, 21.944f, 4.286f, 21.993f, 4.652f)
                lineTo(22f, 4.754f)
                verticalLineTo(19.25f)
                curveTo(22f, 19.629f, 21.718f, 19.943f, 21.352f, 19.993f)
                lineTo(21.25f, 20f)
                horizontalLineTo(2.75f)
                curveTo(2.37f, 20f, 2.057f, 19.717f, 2.007f, 19.351f)
                lineTo(2f, 19.25f)
                verticalLineTo(4.754f)
                curveTo(2f, 4.374f, 2.282f, 4.06f, 2.648f, 4.011f)
                lineTo(2.75f, 4.004f)
                horizontalLineTo(21.25f)
                close()
                moveTo(6f, 12.004f)
                horizontalLineTo(3.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(12.004f)
                horizontalLineTo(18f)
                verticalLineTo(16.25f)
                curveTo(18f, 16.664f, 17.664f, 17f, 17.25f, 17f)
                curveTo(16.87f, 17f, 16.556f, 16.717f, 16.507f, 16.351f)
                lineTo(16.5f, 16.25f)
                verticalLineTo(12.004f)
                horizontalLineTo(14.5f)
                verticalLineTo(16.25f)
                curveTo(14.5f, 16.664f, 14.164f, 17f, 13.75f, 17f)
                curveTo(13.37f, 17f, 13.057f, 16.717f, 13.007f, 16.351f)
                lineTo(13f, 16.25f)
                verticalLineTo(12.004f)
                horizontalLineTo(11f)
                verticalLineTo(16.25f)
                curveTo(11f, 16.664f, 10.664f, 17f, 10.25f, 17f)
                curveTo(9.87f, 17f, 9.557f, 16.717f, 9.507f, 16.351f)
                lineTo(9.5f, 16.25f)
                verticalLineTo(12.004f)
                horizontalLineTo(7.5f)
                verticalLineTo(16.25f)
                curveTo(7.5f, 16.664f, 7.164f, 17f, 6.75f, 17f)
                curveTo(6.37f, 17f, 6.057f, 16.717f, 6.007f, 16.351f)
                lineTo(6f, 16.25f)
                verticalLineTo(12.004f)
                close()
                moveTo(17.25f, 7.5f)
                horizontalLineTo(14.75f)
                lineTo(14.648f, 7.507f)
                curveTo(14.282f, 7.557f, 14f, 7.871f, 14f, 8.25f)
                curveTo(14f, 8.63f, 14.282f, 8.944f, 14.648f, 8.994f)
                lineTo(14.75f, 9f)
                horizontalLineTo(17.25f)
                lineTo(17.352f, 8.994f)
                curveTo(17.718f, 8.944f, 18f, 8.63f, 18f, 8.25f)
                curveTo(18f, 7.836f, 17.664f, 7.5f, 17.25f, 7.5f)
                close()
                moveTo(6.25f, 7.5f)
                curveTo(5.836f, 7.5f, 5.5f, 7.835f, 5.5f, 8.25f)
                curveTo(5.5f, 8.664f, 5.836f, 9f, 6.25f, 9f)
                curveTo(6.664f, 9f, 7f, 8.664f, 7f, 8.25f)
                curveTo(7f, 7.835f, 6.664f, 7.5f, 6.25f, 7.5f)
                close()
                moveTo(9.25f, 7.5f)
                curveTo(8.836f, 7.5f, 8.5f, 7.835f, 8.5f, 8.25f)
                curveTo(8.5f, 8.664f, 8.836f, 9f, 9.25f, 9f)
                curveTo(9.664f, 9f, 10f, 8.664f, 10f, 8.25f)
                curveTo(10f, 7.835f, 9.664f, 7.5f, 9.25f, 7.5f)
                close()
            }
        }.build()

        return _Midi!!
    }

@Suppress("ObjectPropertyName")
private var _Midi: ImageVector? = null

@Preview
@Composable
private fun MidiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Midi, contentDescription = null)
    }
}
