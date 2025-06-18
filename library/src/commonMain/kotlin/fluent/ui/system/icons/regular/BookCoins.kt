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

public val FluentUi.Regular.BookCoins: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookCoins",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.197f, 7.464f)
            curveTo(10.819f, 7.167f, 11.634f, 7f, 12.5f, 7f)
            curveTo(13.366f, 7f, 14.181f, 7.167f, 14.803f, 7.464f)
            curveTo(15.378f, 7.739f, 16f, 8.241f, 16f, 9f)
            curveTo(16f, 9.759f, 15.378f, 10.261f, 14.803f, 10.536f)
            curveTo(14.181f, 10.833f, 13.366f, 11f, 12.5f, 11f)
            curveTo(11.634f, 11f, 10.819f, 10.833f, 10.197f, 10.536f)
            curveTo(9.622f, 10.261f, 9f, 9.759f, 9f, 9f)
            curveTo(9f, 8.241f, 9.622f, 7.739f, 10.197f, 7.464f)
            close()
            moveTo(10.737f, 8.592f)
            curveTo(10.272f, 8.814f, 10.25f, 9f, 10.25f, 9f)
            curveTo(10.25f, 9f, 10.272f, 9.186f, 10.737f, 9.408f)
            curveTo(11.156f, 9.609f, 11.778f, 9.75f, 12.5f, 9.75f)
            curveTo(13.222f, 9.75f, 13.844f, 9.609f, 14.263f, 9.408f)
            curveTo(14.728f, 9.186f, 14.75f, 9f, 14.75f, 9f)
            curveTo(14.75f, 9f, 14.728f, 8.814f, 14.263f, 8.592f)
            curveTo(13.844f, 8.391f, 13.222f, 8.25f, 12.5f, 8.25f)
            curveTo(11.778f, 8.25f, 11.156f, 8.391f, 10.737f, 8.592f)
            close()
            moveTo(12.5f, 12f)
            curveTo(13.911f, 12f, 15.17f, 11.567f, 15.995f, 10.89f)
            curveTo(15.998f, 10.927f, 16f, 10.963f, 16f, 11f)
            curveTo(16f, 12.105f, 14.433f, 13f, 12.5f, 13f)
            curveTo(10.567f, 13f, 9f, 12.105f, 9f, 11f)
            curveTo(9f, 10.963f, 9.002f, 10.927f, 9.005f, 10.89f)
            curveTo(9.83f, 11.567f, 11.089f, 12f, 12.5f, 12f)
            close()
            moveTo(12.5f, 14f)
            curveTo(13.911f, 14f, 15.17f, 13.567f, 15.995f, 12.89f)
            curveTo(15.998f, 12.927f, 16f, 12.963f, 16f, 13f)
            curveTo(16f, 14.105f, 14.433f, 15f, 12.5f, 15f)
            curveTo(10.567f, 15f, 9f, 14.105f, 9f, 13f)
            curveTo(9f, 12.963f, 9.002f, 12.927f, 9.005f, 12.89f)
            curveTo(9.83f, 13.567f, 11.089f, 14f, 12.5f, 14f)
            close()
            moveTo(6.5f, 2f)
            curveTo(5.119f, 2f, 4f, 3.119f, 4f, 4.5f)
            verticalLineTo(19.5f)
            curveTo(4f, 20.881f, 5.119f, 22f, 6.5f, 22f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 22f, 20.5f, 21.664f, 20.5f, 21.25f)
            curveTo(20.5f, 20.836f, 20.164f, 20.5f, 19.75f, 20.5f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 20.5f, 5.5f, 20.052f, 5.5f, 19.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 19.5f, 20.5f, 19.164f, 20.5f, 18.75f)
            verticalLineTo(4.5f)
            curveTo(20.5f, 3.119f, 19.381f, 2f, 18f, 2f)
            horizontalLineTo(6.5f)
            close()
            moveTo(19f, 18f)
            horizontalLineTo(5.5f)
            verticalLineTo(4.5f)
            curveTo(5.5f, 3.948f, 5.948f, 3.5f, 6.5f, 3.5f)
            horizontalLineTo(18f)
            curveTo(18.552f, 3.5f, 19f, 3.948f, 19f, 4.5f)
            verticalLineTo(18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookCoinsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BookCoins, contentDescription = null)
    }
}
