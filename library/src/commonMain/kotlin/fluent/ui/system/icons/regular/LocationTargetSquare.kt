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

public val FluentUi.Regular.LocationTargetSquare: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LocationTargetSquare",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(4.5f, 6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(9f, 12f)
            curveTo(9f, 10.343f, 10.343f, 9f, 12f, 9f)
            curveTo(13.657f, 9f, 15f, 10.343f, 15f, 12f)
            curveTo(15f, 13.657f, 13.657f, 15f, 12f, 15f)
            curveTo(10.343f, 15f, 9f, 13.657f, 9f, 12f)
            close()
            moveTo(7.562f, 11.25f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 11.25f, 6f, 11.586f, 6f, 12f)
            curveTo(6f, 12.414f, 6.336f, 12.75f, 6.75f, 12.75f)
            horizontalLineTo(7.562f)
            curveTo(7.878f, 14.634f, 9.366f, 16.122f, 11.25f, 16.438f)
            verticalLineTo(17.25f)
            curveTo(11.25f, 17.664f, 11.586f, 18f, 12f, 18f)
            curveTo(12.414f, 18f, 12.75f, 17.664f, 12.75f, 17.25f)
            verticalLineTo(16.438f)
            curveTo(14.634f, 16.122f, 16.122f, 14.634f, 16.438f, 12.75f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 12.75f, 18f, 12.414f, 18f, 12f)
            curveTo(18f, 11.586f, 17.664f, 11.25f, 17.25f, 11.25f)
            horizontalLineTo(16.438f)
            curveTo(16.122f, 9.366f, 14.634f, 7.878f, 12.75f, 7.562f)
            verticalLineTo(6.75f)
            curveTo(12.75f, 6.336f, 12.414f, 6f, 12f, 6f)
            curveTo(11.586f, 6f, 11.25f, 6.336f, 11.25f, 6.75f)
            verticalLineTo(7.562f)
            curveTo(9.366f, 7.878f, 7.878f, 9.366f, 7.562f, 11.25f)
            close()
            moveTo(13.5f, 12f)
            curveTo(13.5f, 12.828f, 12.828f, 13.5f, 12f, 13.5f)
            curveTo(11.172f, 13.5f, 10.5f, 12.828f, 10.5f, 12f)
            curveTo(10.5f, 11.172f, 11.172f, 10.5f, 12f, 10.5f)
            curveTo(12.828f, 10.5f, 13.5f, 11.172f, 13.5f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LocationTargetSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.LocationTargetSquare, contentDescription = null)
    }
}
