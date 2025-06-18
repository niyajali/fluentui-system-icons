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

public val FluentUi.Regular.ArrowEnterLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowEnterLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.251f, 4f)
            curveTo(21.665f, 4f, 22.001f, 4.336f, 22.001f, 4.75f)
            verticalLineTo(11.25f)
            curveTo(22.001f, 13.321f, 20.322f, 15f, 18.251f, 15f)
            horizontalLineTo(4.586f)
            lineTo(8.306f, 18.72f)
            curveTo(8.572f, 18.986f, 8.596f, 19.403f, 8.378f, 19.696f)
            lineTo(8.306f, 19.78f)
            curveTo(8.039f, 20.047f, 7.623f, 20.071f, 7.329f, 19.853f)
            lineTo(7.245f, 19.78f)
            lineTo(2.245f, 14.78f)
            curveTo(1.979f, 14.514f, 1.955f, 14.097f, 2.172f, 13.804f)
            lineTo(2.245f, 13.72f)
            lineTo(7.245f, 8.72f)
            curveTo(7.538f, 8.427f, 8.013f, 8.427f, 8.306f, 8.72f)
            curveTo(8.572f, 8.986f, 8.596f, 9.403f, 8.378f, 9.696f)
            lineTo(8.306f, 9.78f)
            lineTo(4.586f, 13.5f)
            horizontalLineTo(18.251f)
            curveTo(19.441f, 13.5f, 20.416f, 12.575f, 20.495f, 11.404f)
            lineTo(20.501f, 11.25f)
            verticalLineTo(4.75f)
            curveTo(20.501f, 4.336f, 20.836f, 4f, 21.251f, 4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowEnterLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowEnterLeft, contentDescription = null)
    }
}
