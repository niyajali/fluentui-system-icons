package fluent.ui.system.icons.light

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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.TextDensity: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.TextDensity",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17f, 2.5f)
            curveTo(17f, 2.224f, 16.776f, 2f, 16.5f, 2f)
            curveTo(16.224f, 2f, 16f, 2.224f, 16f, 2.5f)
            verticalLineTo(29.5f)
            curveTo(16f, 29.776f, 16.224f, 30f, 16.5f, 30f)
            curveTo(16.776f, 30f, 17f, 29.776f, 17f, 29.5f)
            verticalLineTo(2.5f)
            close()
            moveTo(18.5f, 8f)
            horizontalLineTo(26f)
            curveTo(27.105f, 8f, 28f, 8.895f, 28f, 10f)
            curveTo(28f, 11.105f, 27.105f, 12f, 26f, 12f)
            horizontalLineTo(18.5f)
            verticalLineTo(13f)
            horizontalLineTo(26f)
            curveTo(27.657f, 13f, 29f, 11.657f, 29f, 10f)
            curveTo(29f, 8.343f, 27.657f, 7f, 26f, 7f)
            horizontalLineTo(18.5f)
            verticalLineTo(8f)
            close()
            moveTo(26f, 19f)
            horizontalLineTo(18.5f)
            verticalLineTo(18f)
            horizontalLineTo(26f)
            curveTo(27.657f, 18f, 29f, 19.343f, 29f, 21f)
            curveTo(29f, 22.657f, 27.657f, 24f, 26f, 24f)
            horizontalLineTo(18.5f)
            verticalLineTo(23f)
            horizontalLineTo(26f)
            curveTo(27.105f, 23f, 28f, 22.105f, 28f, 21f)
            curveTo(28f, 19.895f, 27.105f, 19f, 26f, 19f)
            close()
            moveTo(3.5f, 5f)
            curveTo(3.224f, 5f, 3f, 5.224f, 3f, 5.5f)
            curveTo(3f, 5.776f, 3.224f, 6f, 3.5f, 6f)
            horizontalLineTo(14.5f)
            verticalLineTo(5f)
            horizontalLineTo(3.5f)
            close()
            moveTo(3f, 25.5f)
            curveTo(3f, 25.224f, 3.224f, 25f, 3.5f, 25f)
            horizontalLineTo(14.5f)
            verticalLineTo(26f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 26f, 3f, 25.776f, 3f, 25.5f)
            close()
            moveTo(3.5f, 20f)
            curveTo(3.224f, 20f, 3f, 20.224f, 3f, 20.5f)
            curveTo(3f, 20.776f, 3.224f, 21f, 3.5f, 21f)
            horizontalLineTo(14.5f)
            verticalLineTo(20f)
            horizontalLineTo(3.5f)
            close()
            moveTo(3f, 15.5f)
            curveTo(3f, 15.224f, 3.224f, 15f, 3.5f, 15f)
            horizontalLineTo(14.5f)
            verticalLineTo(16f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 16f, 3f, 15.776f, 3f, 15.5f)
            close()
            moveTo(3.5f, 10f)
            curveTo(3.224f, 10f, 3f, 10.224f, 3f, 10.5f)
            curveTo(3f, 10.776f, 3.224f, 11f, 3.5f, 11f)
            horizontalLineTo(14.5f)
            verticalLineTo(10f)
            horizontalLineTo(3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextDensityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.TextDensity, contentDescription = null)
    }
}
