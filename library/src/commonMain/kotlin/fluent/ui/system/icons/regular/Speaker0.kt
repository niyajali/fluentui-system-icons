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

public val FluentUi.Regular.Speaker0: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Speaker0",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.704f, 3.441f)
            curveTo(14.895f, 3.666f, 15f, 3.952f, 15f, 4.248f)
            verticalLineTo(19.75f)
            curveTo(15f, 20.44f, 14.44f, 21f, 13.75f, 21f)
            curveTo(13.454f, 21f, 13.168f, 20.895f, 12.942f, 20.704f)
            lineTo(7.975f, 16.498f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 16.498f, 2f, 15.491f, 2f, 14.248f)
            verticalLineTo(9.748f)
            curveTo(2f, 8.505f, 3.007f, 7.498f, 4.25f, 7.498f)
            horizontalLineTo(7.975f)
            lineTo(12.943f, 3.294f)
            curveTo(13.469f, 2.848f, 14.258f, 2.914f, 14.704f, 3.441f)
            close()
            moveTo(13.5f, 4.787f)
            lineTo(8.525f, 8.998f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 8.998f, 3.5f, 9.334f, 3.5f, 9.748f)
            verticalLineTo(14.248f)
            curveTo(3.5f, 14.662f, 3.836f, 14.998f, 4.25f, 14.998f)
            horizontalLineTo(8.525f)
            lineTo(13.5f, 19.21f)
            verticalLineTo(4.787f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Speaker0Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Speaker0, contentDescription = null)
    }
}
