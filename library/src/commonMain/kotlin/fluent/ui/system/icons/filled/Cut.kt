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

public val FluentIcons.Filled.Cut: ImageVector
    get() {
        if (_Cut != null) {
            return _Cut!!
        }
        _Cut = ImageVector.Builder(
            name = "Filled.Cut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.829f, 2.439f)
                curveTo(7.521f, 1.981f, 6.899f, 1.86f, 6.441f, 2.169f)
                curveTo(5.983f, 2.477f, 5.862f, 3.099f, 6.171f, 3.557f)
                lineTo(10.963f, 10.671f)
                lineTo(8.637f, 14.349f)
                curveTo(8.137f, 14.124f, 7.583f, 14f, 7f, 14f)
                curveTo(4.791f, 14f, 3f, 15.79f, 3f, 18f)
                curveTo(3f, 20.209f, 4.791f, 22f, 7f, 22f)
                curveTo(9.209f, 22f, 11f, 20.209f, 11f, 18f)
                curveTo(11f, 17.103f, 10.705f, 16.275f, 10.207f, 15.608f)
                lineTo(12.184f, 12.483f)
                lineTo(14.068f, 15.279f)
                curveTo(13.405f, 15.993f, 13f, 16.949f, 13f, 18f)
                curveTo(13f, 20.209f, 14.791f, 22f, 17f, 22f)
                curveTo(19.209f, 22f, 21f, 20.209f, 21f, 18f)
                curveTo(21f, 15.79f, 19.209f, 14f, 17f, 14f)
                curveTo(16.564f, 14f, 16.144f, 14.069f, 15.751f, 14.198f)
                lineTo(12.132f, 8.824f)
                lineTo(12.131f, 8.825f)
                lineTo(7.829f, 2.439f)
                close()
                moveTo(5f, 18f)
                curveTo(5f, 16.895f, 5.895f, 16f, 7f, 16f)
                curveTo(8.105f, 16f, 9f, 16.895f, 9f, 18f)
                curveTo(9f, 19.104f, 8.105f, 20f, 7f, 20f)
                curveTo(5.895f, 20f, 5f, 19.104f, 5f, 18f)
                close()
                moveTo(15f, 18f)
                curveTo(15f, 16.895f, 15.895f, 16f, 17f, 16f)
                curveTo(18.105f, 16f, 19f, 16.895f, 19f, 18f)
                curveTo(19f, 19.104f, 18.105f, 20f, 17f, 20f)
                curveTo(15.895f, 20f, 15f, 19.104f, 15f, 18f)
                close()
                moveTo(14.52f, 8.79f)
                lineTo(17.845f, 3.534f)
                curveTo(18.14f, 3.067f, 18.001f, 2.45f, 17.535f, 2.155f)
                curveTo(17.068f, 1.859f, 16.45f, 1.998f, 16.155f, 2.465f)
                lineTo(13.3f, 6.978f)
                lineTo(14.52f, 8.79f)
                close()
            }
        }.build()

        return _Cut!!
    }

@Suppress("ObjectPropertyName")
private var _Cut: ImageVector? = null

@Preview
@Composable
private fun CutPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Cut, contentDescription = null)
    }
}
