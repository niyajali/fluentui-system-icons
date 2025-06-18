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

public val FluentUi.Filled.DocumentTableSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentTableSearch",
        defaultWidth = 24.dp,
        defaultHeight = 25.dp,
        viewportWidth = 24f,
        viewportHeight = 25f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.475f, 19.5f)
            horizontalLineTo(15.25f)
            curveTo(16.216f, 19.5f, 17f, 18.716f, 17f, 17.75f)
            verticalLineTo(13.75f)
            curveTo(17f, 12.783f, 16.216f, 12f, 15.25f, 12f)
            horizontalLineTo(8.75f)
            curveTo(8.509f, 12f, 8.28f, 12.049f, 8.071f, 12.137f)
            curveTo(7.304f, 11.73f, 6.429f, 11.5f, 5.5f, 11.5f)
            curveTo(4.98f, 11.5f, 4.477f, 11.572f, 4f, 11.707f)
            verticalLineTo(4.5f)
            curveTo(4f, 3.395f, 4.895f, 2.5f, 6f, 2.5f)
            horizontalLineTo(12f)
            verticalLineTo(8.5f)
            curveTo(12f, 9.605f, 12.895f, 10.5f, 14f, 10.5f)
            horizontalLineTo(20f)
            verticalLineTo(20.5f)
            curveTo(20f, 21.605f, 19.105f, 22.5f, 18f, 22.5f)
            horizontalLineTo(12.982f)
            curveTo(12.93f, 22.139f, 12.765f, 21.791f, 12.487f, 21.513f)
            lineTo(10.475f, 19.5f)
            close()
            moveTo(15.5f, 16.5f)
            verticalLineTo(17.75f)
            curveTo(15.5f, 17.888f, 15.388f, 18f, 15.25f, 18f)
            horizontalLineTo(11.5f)
            verticalLineTo(16.5f)
            horizontalLineTo(15.5f)
            close()
            moveTo(11.5f, 15f)
            verticalLineTo(13.5f)
            horizontalLineTo(15.25f)
            curveTo(15.388f, 13.5f, 15.5f, 13.612f, 15.5f, 13.75f)
            verticalLineTo(15f)
            horizontalLineTo(11.5f)
            close()
            moveTo(13.5f, 3f)
            verticalLineTo(8.5f)
            curveTo(13.5f, 8.776f, 13.724f, 9f, 14f, 9f)
            horizontalLineTo(19.5f)
            lineTo(13.5f, 3f)
            close()
            moveTo(9.168f, 19.607f)
            curveTo(9.692f, 18.872f, 10f, 17.972f, 10f, 17f)
            curveTo(10f, 14.515f, 7.985f, 12.5f, 5.5f, 12.5f)
            curveTo(3.015f, 12.5f, 1f, 14.515f, 1f, 17f)
            curveTo(1f, 19.485f, 3.015f, 21.5f, 5.5f, 21.5f)
            curveTo(6.472f, 21.5f, 7.372f, 21.192f, 8.107f, 20.668f)
            lineTo(10.72f, 23.28f)
            curveTo(11.013f, 23.573f, 11.487f, 23.573f, 11.78f, 23.28f)
            curveTo(12.073f, 22.987f, 12.073f, 22.513f, 11.78f, 22.22f)
            lineTo(9.168f, 19.607f)
            close()
            moveTo(8.5f, 17f)
            curveTo(8.5f, 18.657f, 7.157f, 20f, 5.5f, 20f)
            curveTo(3.843f, 20f, 2.5f, 18.657f, 2.5f, 17f)
            curveTo(2.5f, 15.343f, 3.843f, 14f, 5.5f, 14f)
            curveTo(7.157f, 14f, 8.5f, 15.343f, 8.5f, 17f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentTableSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentTableSearch, contentDescription = null)
    }
}
