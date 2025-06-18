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

public val FluentUi.Regular.ReOrderVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ReOrderVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.25f, 21.25f)
            verticalLineTo(2.75f)
            curveTo(13.25f, 2.336f, 13.586f, 2f, 14f, 2f)
            curveTo(14.38f, 2f, 14.693f, 2.282f, 14.743f, 2.648f)
            lineTo(14.75f, 2.75f)
            verticalLineTo(21.25f)
            curveTo(14.75f, 21.664f, 14.414f, 22f, 14f, 22f)
            curveTo(13.62f, 22f, 13.307f, 21.718f, 13.257f, 21.352f)
            lineTo(13.25f, 21.25f)
            close()
            moveTo(9.25f, 21.25f)
            verticalLineTo(2.75f)
            curveTo(9.25f, 2.336f, 9.586f, 2f, 10f, 2f)
            curveTo(10.38f, 2f, 10.693f, 2.282f, 10.743f, 2.648f)
            lineTo(10.75f, 2.75f)
            verticalLineTo(21.25f)
            curveTo(10.75f, 21.664f, 10.414f, 22f, 10f, 22f)
            curveTo(9.62f, 22f, 9.307f, 21.718f, 9.257f, 21.352f)
            lineTo(9.25f, 21.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReOrderVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ReOrderVertical, contentDescription = null)
    }
}
