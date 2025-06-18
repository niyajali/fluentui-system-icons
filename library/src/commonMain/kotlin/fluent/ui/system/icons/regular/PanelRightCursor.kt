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

public val FluentUi.Regular.PanelRightCursor: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PanelRightCursor",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 7.25f)
            curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
            horizontalLineTo(13.001f)
            lineTo(13.002f, 18.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 18.5f, 3.5f, 17.716f, 3.5f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(3.5f, 6.284f, 4.284f, 5.5f, 5.25f, 5.5f)
            horizontalLineTo(14.5f)
            verticalLineTo(11.019f)
            curveTo(15.045f, 10.938f, 15.605f, 11.12f, 16f, 11.521f)
            verticalLineTo(5.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 5.5f, 20.5f, 6.284f, 20.5f, 7.25f)
            verticalLineTo(16.507f)
            lineTo(21.78f, 17.927f)
            curveTo(21.922f, 17.562f, 22f, 17.165f, 22f, 16.75f)
            verticalLineTo(7.25f)
            close()
            moveTo(14.486f, 12.05f)
            curveTo(14.776f, 11.939f, 15.104f, 12.017f, 15.312f, 12.248f)
            lineTo(21.677f, 19.305f)
            curveTo(21.897f, 19.55f, 21.932f, 19.91f, 21.763f, 20.193f)
            curveTo(21.593f, 20.476f, 21.259f, 20.615f, 20.939f, 20.535f)
            lineTo(17.402f, 19.657f)
            lineTo(15.372f, 22.671f)
            curveTo(15.188f, 22.945f, 14.846f, 23.066f, 14.531f, 22.97f)
            curveTo(14.215f, 22.873f, 14f, 22.582f, 14f, 22.252f)
            lineTo(14.005f, 12.75f)
            curveTo(14.005f, 12.439f, 14.196f, 12.161f, 14.486f, 12.05f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PanelRightCursorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PanelRightCursor, contentDescription = null)
    }
}
