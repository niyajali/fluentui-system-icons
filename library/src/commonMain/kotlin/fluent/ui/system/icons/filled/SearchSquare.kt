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

public val FluentUi.Filled.SearchSquare: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SearchSquare",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 14f)
            curveTo(12.657f, 14f, 14f, 12.657f, 14f, 11f)
            curveTo(14f, 9.343f, 12.657f, 8f, 11f, 8f)
            curveTo(9.343f, 8f, 8f, 9.343f, 8f, 11f)
            curveTo(8f, 12.657f, 9.343f, 14f, 11f, 14f)
            close()
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(11f, 15.5f)
            curveTo(11.972f, 15.5f, 12.872f, 15.192f, 13.607f, 14.668f)
            lineTo(16.22f, 17.28f)
            curveTo(16.513f, 17.573f, 16.987f, 17.573f, 17.28f, 17.28f)
            curveTo(17.573f, 16.987f, 17.573f, 16.513f, 17.28f, 16.22f)
            lineTo(14.668f, 13.607f)
            curveTo(15.192f, 12.872f, 15.5f, 11.972f, 15.5f, 11f)
            curveTo(15.5f, 8.515f, 13.485f, 6.5f, 11f, 6.5f)
            curveTo(8.515f, 6.5f, 6.5f, 8.515f, 6.5f, 11f)
            curveTo(6.5f, 13.485f, 8.515f, 15.5f, 11f, 15.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SearchSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SearchSquare, contentDescription = null)
    }
}
