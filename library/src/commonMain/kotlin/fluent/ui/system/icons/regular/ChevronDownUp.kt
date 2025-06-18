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

public val FluentUi.Regular.ChevronDownUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronDownUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.28f, 2.97f)
            curveTo(5.987f, 2.677f, 5.513f, 2.677f, 5.22f, 2.97f)
            curveTo(4.927f, 3.263f, 4.927f, 3.737f, 5.22f, 4.03f)
            lineTo(11.47f, 10.28f)
            curveTo(11.763f, 10.573f, 12.237f, 10.573f, 12.53f, 10.28f)
            lineTo(18.78f, 4.03f)
            curveTo(19.073f, 3.737f, 19.073f, 3.263f, 18.78f, 2.97f)
            curveTo(18.487f, 2.677f, 18.013f, 2.677f, 17.72f, 2.97f)
            lineTo(12f, 8.689f)
            lineTo(6.28f, 2.97f)
            close()
            moveTo(6.28f, 21.03f)
            curveTo(5.987f, 21.323f, 5.513f, 21.323f, 5.22f, 21.03f)
            curveTo(4.927f, 20.737f, 4.927f, 20.263f, 5.22f, 19.97f)
            lineTo(11.47f, 13.72f)
            curveTo(11.763f, 13.427f, 12.237f, 13.427f, 12.53f, 13.72f)
            lineTo(18.78f, 19.97f)
            curveTo(19.073f, 20.263f, 19.073f, 20.737f, 18.78f, 21.03f)
            curveTo(18.487f, 21.323f, 18.013f, 21.323f, 17.72f, 21.03f)
            lineTo(12f, 15.311f)
            lineTo(6.28f, 21.03f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChevronDownUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ChevronDownUp, contentDescription = null)
    }
}
