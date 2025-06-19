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

public val FluentIcons.Filled.WindowWrench: ImageVector
    get() {
        if (_WindowWrench != null) {
            return _WindowWrench!!
        }
        _WindowWrench = ImageVector.Builder(
            name = "Filled.WindowWrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(11.044f)
                curveTo(11.136f, 20.518f, 11.368f, 20.058f, 11.74f, 19.686f)
                lineTo(11.926f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(11.032f)
                curveTo(19.672f, 11.052f, 19.843f, 11.08f, 20.012f, 11.117f)
                curveTo(20.482f, 11.219f, 20.826f, 11.529f, 21f, 11.908f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(20.131f, 12.51f)
                curveTo(20.131f, 12.32f, 20.014f, 12.141f, 19.799f, 12.094f)
                curveTo(19.7f, 12.072f, 19.6f, 12.054f, 19.5f, 12.04f)
                curveTo(18.276f, 11.867f, 16.988f, 12.252f, 16.047f, 13.193f)
                curveTo(14.838f, 14.401f, 14.548f, 16.181f, 15.176f, 17.663f)
                lineTo(12.447f, 20.393f)
                curveTo(12.271f, 20.569f, 12.147f, 20.778f, 12.075f, 21f)
                curveTo(11.903f, 21.529f, 12.027f, 22.133f, 12.447f, 22.553f)
                curveTo(13.044f, 23.149f, 14.011f, 23.149f, 14.607f, 22.553f)
                lineTo(17.337f, 19.823f)
                curveTo(18.819f, 20.451f, 20.598f, 20.161f, 21.807f, 18.952f)
                curveTo(22.826f, 17.934f, 23.192f, 16.511f, 22.906f, 15.201f)
                curveTo(22.829f, 14.848f, 22.399f, 14.761f, 22.144f, 15.016f)
                lineTo(20.239f, 16.92f)
                curveTo(20.211f, 16.948f, 20.183f, 16.975f, 20.153f, 17f)
                curveTo(19.96f, 17.166f, 19.735f, 17.276f, 19.5f, 17.329f)
                curveTo(19.005f, 17.442f, 18.465f, 17.306f, 18.08f, 16.92f)
                curveTo(17.483f, 16.324f, 17.483f, 15.357f, 18.08f, 14.76f)
                lineTo(19.984f, 12.856f)
                curveTo(20.083f, 12.757f, 20.13f, 12.631f, 20.131f, 12.51f)
                close()
                moveTo(17.72f, 21f)
                curveTo(17.681f, 20.99f, 17.643f, 20.98f, 17.604f, 20.97f)
                lineTo(17.574f, 21f)
                horizontalLineTo(17.72f)
                close()
            }
        }.build()

        return _WindowWrench!!
    }

@Suppress("ObjectPropertyName")
private var _WindowWrench: ImageVector? = null

@Preview
@Composable
private fun WindowWrenchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WindowWrench, contentDescription = null)
    }
}
