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

public val FluentIcons.Filled.TargetArrow: ImageVector
    get() {
        if (_TargetArrow != null) {
            return _TargetArrow!!
        }
        _TargetArrow = ImageVector.Builder(
            name = "Filled.TargetArrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.78f, 6.78f)
                curveTo(21.995f, 6.566f, 22.059f, 6.243f, 21.943f, 5.963f)
                curveTo(21.827f, 5.683f, 21.553f, 5.5f, 21.25f, 5.5f)
                lineTo(18.5f, 5.5f)
                verticalLineTo(2.75f)
                curveTo(18.5f, 2.447f, 18.317f, 2.173f, 18.037f, 2.057f)
                curveTo(17.757f, 1.941f, 17.434f, 2.005f, 17.22f, 2.22f)
                lineTo(14.72f, 4.72f)
                curveTo(14.579f, 4.86f, 14.5f, 5.051f, 14.5f, 5.25f)
                lineTo(14.5f, 8.086f)
                lineTo(12.518f, 10.068f)
                curveTo(12.353f, 10.024f, 12.179f, 10f, 12f, 10f)
                curveTo(10.895f, 10f, 10f, 10.896f, 10f, 12f)
                curveTo(10f, 13.105f, 10.895f, 14f, 12f, 14f)
                curveTo(13.105f, 14f, 14f, 13.105f, 14f, 12f)
                curveTo(14f, 11.821f, 13.976f, 11.647f, 13.932f, 11.482f)
                lineTo(15.914f, 9.5f)
                lineTo(18.75f, 9.5f)
                curveTo(18.949f, 9.5f, 19.14f, 9.421f, 19.28f, 9.28f)
                lineTo(21.78f, 6.78f)
                close()
                moveTo(12f, 2f)
                curveTo(13.203f, 2f, 14.356f, 2.212f, 15.424f, 2.601f)
                lineTo(14.012f, 4.013f)
                curveTo(13.95f, 4.075f, 13.892f, 4.142f, 13.84f, 4.213f)
                curveTo(13.25f, 4.074f, 12.633f, 4f, 12f, 4f)
                curveTo(7.582f, 4f, 4f, 7.582f, 4f, 12f)
                curveTo(4f, 16.418f, 7.582f, 20f, 12f, 20f)
                curveTo(16.418f, 20f, 20f, 16.418f, 20f, 12f)
                curveTo(20f, 11.367f, 19.926f, 10.75f, 19.787f, 10.16f)
                curveTo(19.858f, 10.108f, 19.925f, 10.05f, 19.987f, 9.988f)
                lineTo(21.399f, 8.576f)
                curveTo(21.788f, 9.644f, 22f, 10.797f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                close()
                moveTo(12f, 6f)
                curveTo(12.518f, 6f, 13.021f, 6.066f, 13.5f, 6.189f)
                lineTo(13.5f, 7.672f)
                lineTo(13.086f, 8.086f)
                curveTo(13.069f, 8.102f, 13.053f, 8.119f, 13.037f, 8.136f)
                curveTo(12.707f, 8.047f, 12.359f, 8f, 12f, 8f)
                curveTo(9.791f, 8f, 8f, 9.791f, 8f, 12f)
                curveTo(8f, 14.209f, 9.791f, 16f, 12f, 16f)
                curveTo(14.209f, 16f, 16f, 14.209f, 16f, 12f)
                curveTo(16f, 11.641f, 15.953f, 11.293f, 15.864f, 10.963f)
                curveTo(15.881f, 10.947f, 15.898f, 10.931f, 15.914f, 10.914f)
                lineTo(16.328f, 10.5f)
                lineTo(17.811f, 10.5f)
                curveTo(17.934f, 10.979f, 18f, 11.482f, 18f, 12f)
                curveTo(18f, 15.314f, 15.314f, 18f, 12f, 18f)
                curveTo(8.686f, 18f, 6f, 15.314f, 6f, 12f)
                curveTo(6f, 8.686f, 8.686f, 6f, 12f, 6f)
                close()
            }
        }.build()

        return _TargetArrow!!
    }

@Suppress("ObjectPropertyName")
private var _TargetArrow: ImageVector? = null

@Preview
@Composable
private fun TargetArrowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TargetArrow, contentDescription = null)
    }
}
