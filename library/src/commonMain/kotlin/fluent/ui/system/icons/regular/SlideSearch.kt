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

public val FluentUi.Regular.SlideSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.75f, 4f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineTo(11.257f)
            curveTo(2.446f, 10.889f, 2.952f, 10.589f, 3.5f, 10.375f)
            verticalLineTo(6.75f)
            curveTo(3.5f, 6.06f, 4.06f, 5.5f, 4.75f, 5.5f)
            horizontalLineTo(19.25f)
            curveTo(19.94f, 5.5f, 20.5f, 6.06f, 20.5f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(20.5f, 17.94f, 19.94f, 18.5f, 19.25f, 18.5f)
            horizontalLineTo(10.975f)
            lineTo(12.475f, 20f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 20f, 22f, 18.769f, 22f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
            horizontalLineTo(4.75f)
            close()
            moveTo(8.663f, 11f)
            curveTo(9.236f, 11.403f, 9.728f, 11.913f, 10.111f, 12.5f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 12.5f, 18f, 12.164f, 18f, 11.75f)
            curveTo(18f, 11.336f, 17.664f, 11f, 17.25f, 11f)
            horizontalLineTo(8.663f)
            close()
            moveTo(15.25f, 15.5f)
            horizontalLineTo(11f)
            curveTo(11f, 14.98f, 10.928f, 14.477f, 10.793f, 14f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 14f, 16f, 14.336f, 16f, 14.75f)
            curveTo(16f, 15.164f, 15.664f, 15.5f, 15.25f, 15.5f)
            close()
            moveTo(6.75f, 8f)
            curveTo(6.336f, 8f, 6f, 8.336f, 6f, 8.75f)
            curveTo(6f, 9.164f, 6.336f, 9.5f, 6.75f, 9.5f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 9.5f, 14f, 9.164f, 14f, 8.75f)
            curveTo(14f, 8.336f, 13.664f, 8f, 13.25f, 8f)
            horizontalLineTo(6.75f)
            close()
            moveTo(5.5f, 20f)
            curveTo(6.472f, 20f, 7.372f, 19.692f, 8.107f, 19.168f)
            lineTo(10.72f, 21.78f)
            curveTo(11.013f, 22.073f, 11.487f, 22.073f, 11.78f, 21.78f)
            curveTo(12.073f, 21.487f, 12.073f, 21.013f, 11.78f, 20.72f)
            lineTo(9.168f, 18.107f)
            curveTo(9.692f, 17.372f, 10f, 16.472f, 10f, 15.5f)
            curveTo(10f, 13.015f, 7.985f, 11f, 5.5f, 11f)
            curveTo(3.015f, 11f, 1f, 13.015f, 1f, 15.5f)
            curveTo(1f, 17.985f, 3.015f, 20f, 5.5f, 20f)
            close()
            moveTo(5.5f, 18.5f)
            curveTo(3.843f, 18.5f, 2.5f, 17.157f, 2.5f, 15.5f)
            curveTo(2.5f, 13.843f, 3.843f, 12.5f, 5.5f, 12.5f)
            curveTo(7.157f, 12.5f, 8.5f, 13.843f, 8.5f, 15.5f)
            curveTo(8.5f, 17.157f, 7.157f, 18.5f, 5.5f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SlideSearch, contentDescription = null)
    }
}
