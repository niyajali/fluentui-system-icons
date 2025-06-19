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

public val FluentIcons.Regular.SoundWaveCircle: ImageVector
    get() {
        if (_SoundWaveCircle != null) {
            return _SoundWaveCircle!!
        }
        _SoundWaveCircle = ImageVector.Builder(
            name = "Regular.SoundWaveCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 8.75f)
                curveTo(11f, 8.336f, 10.664f, 8f, 10.25f, 8f)
                curveTo(9.836f, 8f, 9.5f, 8.336f, 9.5f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(9.5f, 15.664f, 9.836f, 16f, 10.25f, 16f)
                curveTo(10.664f, 16f, 11f, 15.664f, 11f, 15.25f)
                verticalLineTo(8.75f)
                close()
                moveTo(17f, 8.75f)
                curveTo(17f, 8.336f, 16.664f, 8f, 16.25f, 8f)
                curveTo(15.836f, 8f, 15.5f, 8.336f, 15.5f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(15.5f, 15.664f, 15.836f, 16f, 16.25f, 16f)
                curveTo(16.664f, 16f, 17f, 15.664f, 17f, 15.25f)
                verticalLineTo(8.75f)
                close()
                moveTo(14f, 10.25f)
                curveTo(14f, 9.836f, 13.664f, 9.5f, 13.25f, 9.5f)
                curveTo(12.836f, 9.5f, 12.5f, 9.836f, 12.5f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(12.5f, 14.164f, 12.836f, 14.5f, 13.25f, 14.5f)
                curveTo(13.664f, 14.5f, 14f, 14.164f, 14f, 13.75f)
                verticalLineTo(10.25f)
                close()
                moveTo(8f, 10.75f)
                curveTo(8f, 10.336f, 7.664f, 10f, 7.25f, 10f)
                curveTo(6.836f, 10f, 6.5f, 10.336f, 6.5f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(6.5f, 13.664f, 6.836f, 14f, 7.25f, 14f)
                curveTo(7.664f, 14f, 8f, 13.664f, 8f, 13.25f)
                verticalLineTo(10.75f)
                close()
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(3.5f, 12f)
                curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
                curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
                curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
                curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
                close()
            }
        }.build()

        return _SoundWaveCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SoundWaveCircle: ImageVector? = null

@Preview
@Composable
private fun SoundWaveCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SoundWaveCircle, contentDescription = null)
    }
}
