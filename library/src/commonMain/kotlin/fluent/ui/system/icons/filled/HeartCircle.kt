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

public val FluentIcons.Filled.HeartCircle: ImageVector
    get() {
        if (_HeartCircle != null) {
            return _HeartCircle!!
        }
        _HeartCircle = ImageVector.Builder(
            name = "Filled.HeartCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(11.696f, 16.856f)
                lineTo(7.59f, 12.064f)
                curveTo(6.815f, 11.159f, 6.799f, 9.828f, 7.554f, 8.905f)
                curveTo(8.466f, 7.789f, 10.138f, 7.693f, 11.173f, 8.697f)
                lineTo(12f, 9.5f)
                lineTo(12.827f, 8.697f)
                curveTo(13.861f, 7.693f, 15.534f, 7.789f, 16.446f, 8.905f)
                curveTo(17.201f, 9.828f, 17.185f, 11.159f, 16.41f, 12.064f)
                lineTo(12.304f, 16.856f)
                curveTo(12.144f, 17.042f, 11.856f, 17.042f, 11.696f, 16.856f)
                close()
            }
        }.build()

        return _HeartCircle!!
    }

@Suppress("ObjectPropertyName")
private var _HeartCircle: ImageVector? = null

@Preview
@Composable
private fun HeartCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HeartCircle, contentDescription = null)
    }
}
