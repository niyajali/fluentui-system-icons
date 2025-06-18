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

public val FluentUi.Regular.ArrowTurnBidirectionalDownRight: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnBidirectionalDownRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.28f, 3.22f)
            curveTo(16.987f, 2.927f, 16.513f, 2.927f, 16.22f, 3.22f)
            curveTo(15.927f, 3.513f, 15.927f, 3.987f, 16.22f, 4.28f)
            lineTo(19.44f, 7.5f)
            horizontalLineTo(11.75f)
            curveTo(9.403f, 7.5f, 7.5f, 9.403f, 7.5f, 11.75f)
            verticalLineTo(19.439f)
            lineTo(4.28f, 16.22f)
            curveTo(3.987f, 15.927f, 3.513f, 15.927f, 3.22f, 16.22f)
            curveTo(2.927f, 16.513f, 2.927f, 16.987f, 3.22f, 17.28f)
            lineTo(7.72f, 21.78f)
            curveTo(8.013f, 22.073f, 8.488f, 22.073f, 8.781f, 21.78f)
            lineTo(13.28f, 17.281f)
            curveTo(13.573f, 16.988f, 13.573f, 16.513f, 13.28f, 16.22f)
            curveTo(12.987f, 15.927f, 12.512f, 15.927f, 12.22f, 16.22f)
            lineTo(9f, 19.44f)
            verticalLineTo(11.75f)
            curveTo(9f, 10.231f, 10.231f, 9f, 11.75f, 9f)
            horizontalLineTo(19.439f)
            lineTo(16.22f, 12.22f)
            curveTo(15.927f, 12.513f, 15.927f, 12.988f, 16.22f, 13.28f)
            curveTo(16.513f, 13.573f, 16.987f, 13.573f, 17.28f, 13.28f)
            lineTo(21.78f, 8.78f)
            curveTo(21.921f, 8.639f, 22f, 8.448f, 22f, 8.25f)
            curveTo(22f, 8.051f, 21.921f, 7.86f, 21.78f, 7.719f)
            lineTo(17.28f, 3.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowTurnBidirectionalDownRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowTurnBidirectionalDownRight, contentDescription = null)
    }
}
