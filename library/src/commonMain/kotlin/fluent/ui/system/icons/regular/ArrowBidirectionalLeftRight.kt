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

public val FluentUi.Regular.ArrowBidirectionalLeftRight: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowBidirectionalLeftRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.03f, 6.47f)
            curveTo(9.323f, 6.763f, 9.323f, 7.237f, 9.03f, 7.53f)
            lineTo(5.561f, 11f)
            horizontalLineTo(18.439f)
            lineTo(14.97f, 7.53f)
            curveTo(14.677f, 7.237f, 14.677f, 6.763f, 14.97f, 6.47f)
            curveTo(15.263f, 6.177f, 15.737f, 6.177f, 16.03f, 6.47f)
            lineTo(20.78f, 11.22f)
            curveTo(21.073f, 11.513f, 21.073f, 11.987f, 20.78f, 12.28f)
            lineTo(16.03f, 17.03f)
            curveTo(15.737f, 17.323f, 15.263f, 17.323f, 14.97f, 17.03f)
            curveTo(14.677f, 16.737f, 14.677f, 16.263f, 14.97f, 15.97f)
            lineTo(18.439f, 12.5f)
            horizontalLineTo(5.561f)
            lineTo(9.03f, 15.97f)
            curveTo(9.323f, 16.263f, 9.323f, 16.737f, 9.03f, 17.03f)
            curveTo(8.737f, 17.323f, 8.263f, 17.323f, 7.97f, 17.03f)
            lineTo(3.22f, 12.28f)
            curveTo(2.927f, 11.987f, 2.927f, 11.513f, 3.22f, 11.22f)
            lineTo(7.97f, 6.47f)
            curveTo(8.263f, 6.177f, 8.737f, 6.177f, 9.03f, 6.47f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowBidirectionalLeftRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowBidirectionalLeftRight, contentDescription = null)
    }
}
