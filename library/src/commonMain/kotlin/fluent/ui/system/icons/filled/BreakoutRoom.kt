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

public val FluentUi.Filled.BreakoutRoom: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BreakoutRoom",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(12.714f)
            curveTo(13.512f, 20.15f, 14f, 19.007f, 14f, 17.75f)
            verticalLineTo(14.75f)
            curveTo(14f, 12.127f, 11.873f, 10f, 9.25f, 10f)
            horizontalLineTo(6.25f)
            curveTo(4.993f, 10f, 3.85f, 10.488f, 3f, 11.286f)
            verticalLineTo(6.25f)
            close()
            moveTo(3f, 14.75f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(9.25f)
            curveTo(11.045f, 21f, 12.5f, 19.545f, 12.5f, 17.75f)
            verticalLineTo(14.75f)
            curveTo(12.5f, 12.955f, 11.045f, 11.5f, 9.25f, 11.5f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 11.5f, 3f, 12.955f, 3f, 14.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BreakoutRoomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BreakoutRoom, contentDescription = null)
    }
}
