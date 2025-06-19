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

public val FluentIcons.Filled.SlidePlay: ImageVector
    get() {
        if (_SlidePlay != null) {
            return _SlidePlay!!
        }
        _SlidePlay = ImageVector.Builder(
            name = "Filled.SlidePlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 6.75f)
                curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
                verticalLineTo(12.81f)
                curveTo(20.832f, 11.689f, 19.247f, 11f, 17.5f, 11f)
                curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
                curveTo(11f, 18.386f, 11.177f, 19.23f, 11.498f, 20f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(16f, 19.499f)
                curveTo(16f, 19.898f, 16.445f, 20.136f, 16.777f, 19.915f)
                lineTo(19.779f, 17.916f)
                curveTo(20.076f, 17.718f, 20.076f, 17.282f, 19.779f, 17.084f)
                lineTo(16.777f, 15.085f)
                curveTo(16.445f, 14.863f, 16f, 15.102f, 16f, 15.501f)
                verticalLineTo(19.499f)
                close()
            }
        }.build()

        return _SlidePlay!!
    }

@Suppress("ObjectPropertyName")
private var _SlidePlay: ImageVector? = null

@Preview
@Composable
private fun SlidePlayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SlidePlay, contentDescription = null)
    }
}
