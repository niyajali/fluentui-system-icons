package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.KeyboardShift: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.KeyboardShift",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.677f, 2.603f)
            curveTo(11.375f, 1.799f, 12.623f, 1.799f, 13.321f, 2.603f)
            lineTo(21.567f, 12.107f)
            curveTo(22.55f, 13.24f, 21.745f, 15.004f, 20.245f, 15.004f)
            horizontalLineTo(17f)
            verticalLineTo(20.251f)
            curveTo(17f, 21.217f, 16.216f, 22.001f, 15.25f, 22.001f)
            horizontalLineTo(8.75f)
            curveTo(7.783f, 22.001f, 7f, 21.217f, 7f, 20.251f)
            verticalLineTo(15.004f)
            horizontalLineTo(3.754f)
            curveTo(2.254f, 15.004f, 1.449f, 13.24f, 2.432f, 12.107f)
            lineTo(10.677f, 2.603f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun KeyboardShiftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.KeyboardShift, contentDescription = null)
    }
}
