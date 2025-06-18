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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.SlideEraser: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideEraser",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
            verticalLineTo(12.536f)
            lineTo(21.199f, 11.735f)
            curveTo(20.99f, 11.526f, 20.753f, 11.361f, 20.5f, 11.242f)
            verticalLineTo(6.75f)
            curveTo(20.5f, 6.06f, 19.94f, 5.5f, 19.25f, 5.5f)
            horizontalLineTo(4.75f)
            curveTo(4.06f, 5.5f, 3.5f, 6.06f, 3.5f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(3.5f, 17.94f, 4.06f, 18.5f, 4.75f, 18.5f)
            horizontalLineTo(12.015f)
            curveTo(12.032f, 19.034f, 12.219f, 19.563f, 12.576f, 20f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
            verticalLineTo(6.75f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.492f, 12.442f)
            curveTo(19.906f, 11.856f, 18.956f, 11.856f, 18.371f, 12.442f)
            lineTo(15.26f, 15.552f)
            lineTo(19.467f, 19.76f)
            lineTo(22.578f, 16.649f)
            curveTo(23.163f, 16.063f, 23.163f, 15.113f, 22.578f, 14.528f)
            lineTo(20.492f, 12.442f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.453f, 17.359f)
            lineTo(14.553f, 16.26f)
            lineTo(18.76f, 20.467f)
            lineTo(17.66f, 21.566f)
            curveTo(17.074f, 22.152f, 16.125f, 22.152f, 15.539f, 21.566f)
            lineTo(13.453f, 19.481f)
            curveTo(12.867f, 18.895f, 12.867f, 17.945f, 13.453f, 17.359f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideEraserPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SlideEraser, contentDescription = null)
    }
}
