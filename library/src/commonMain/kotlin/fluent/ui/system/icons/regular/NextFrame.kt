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

public val FluentUi.Regular.NextFrame: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NextFrame",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.5f, 3.75f)
            curveTo(5.5f, 3.336f, 5.164f, 3f, 4.75f, 3f)
            curveTo(4.336f, 3f, 4f, 3.336f, 4f, 3.75f)
            verticalLineTo(20.25f)
            curveTo(4f, 20.664f, 4.336f, 21f, 4.75f, 21f)
            curveTo(5.164f, 21f, 5.5f, 20.664f, 5.5f, 20.25f)
            verticalLineTo(3.75f)
            close()
            moveTo(11.739f, 3.309f)
            curveTo(10.578f, 2.514f, 9f, 3.345f, 9f, 4.753f)
            verticalLineTo(19.248f)
            curveTo(9f, 20.661f, 10.589f, 21.492f, 11.749f, 20.685f)
            lineTo(22.248f, 13.383f)
            curveTo(23.253f, 12.684f, 23.248f, 11.195f, 22.238f, 10.503f)
            lineTo(11.739f, 3.309f)
            close()
            moveTo(10.5f, 4.753f)
            curveTo(10.5f, 4.552f, 10.725f, 4.433f, 10.891f, 4.547f)
            lineTo(21.39f, 11.74f)
            curveTo(21.534f, 11.839f, 21.535f, 12.052f, 21.391f, 12.152f)
            lineTo(10.893f, 19.453f)
            curveTo(10.727f, 19.569f, 10.5f, 19.45f, 10.5f, 19.248f)
            verticalLineTo(4.753f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NextFramePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.NextFrame, contentDescription = null)
    }
}
