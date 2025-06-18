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

public val FluentUi.Regular.PositionToBack: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PositionToBack",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14f, 16.75f)
            curveTo(14f, 15.231f, 15.231f, 14f, 16.75f, 14f)
            horizontalLineTo(20.25f)
            curveTo(21.769f, 14f, 23f, 15.231f, 23f, 16.75f)
            verticalLineTo(20.25f)
            curveTo(23f, 21.769f, 21.769f, 23f, 20.25f, 23f)
            horizontalLineTo(16.75f)
            curveTo(15.231f, 23f, 14f, 21.769f, 14f, 20.25f)
            verticalLineTo(16.75f)
            close()
            moveTo(16.75f, 15.5f)
            curveTo(16.06f, 15.5f, 15.5f, 16.06f, 15.5f, 16.75f)
            verticalLineTo(20.25f)
            curveTo(15.5f, 20.94f, 16.06f, 21.5f, 16.75f, 21.5f)
            horizontalLineTo(20.25f)
            curveTo(20.94f, 21.5f, 21.5f, 20.94f, 21.5f, 20.25f)
            verticalLineTo(16.75f)
            curveTo(21.5f, 16.06f, 20.94f, 15.5f, 20.25f, 15.5f)
            horizontalLineTo(16.75f)
            close()
            moveTo(6f, 11f)
            verticalLineTo(14.75f)
            curveTo(6f, 16.545f, 7.455f, 18f, 9.25f, 18f)
            horizontalLineTo(13f)
            verticalLineTo(16.75f)
            curveTo(13f, 16.666f, 13.003f, 16.583f, 13.008f, 16.5f)
            horizontalLineTo(12.684f)
            lineTo(13.05f, 16.133f)
            curveTo(13.311f, 14.556f, 14.556f, 13.311f, 16.133f, 13.05f)
            lineTo(16.5f, 12.684f)
            verticalLineTo(13.008f)
            curveTo(16.583f, 13.003f, 16.666f, 13f, 16.75f, 13f)
            horizontalLineTo(18f)
            verticalLineTo(9.25f)
            curveTo(18f, 7.455f, 16.545f, 6f, 14.75f, 6f)
            horizontalLineTo(11f)
            verticalLineTo(7.25f)
            curveTo(11f, 7.334f, 10.997f, 7.417f, 10.992f, 7.5f)
            horizontalLineTo(11.563f)
            lineTo(10.884f, 8.178f)
            curveTo(10.547f, 9.503f, 9.503f, 10.547f, 8.178f, 10.884f)
            lineTo(7.5f, 11.563f)
            verticalLineTo(10.992f)
            curveTo(7.417f, 10.997f, 7.334f, 11f, 7.25f, 11f)
            horizontalLineTo(6f)
            close()
            moveTo(13.684f, 7.5f)
            horizontalLineTo(14.75f)
            curveTo(14.99f, 7.5f, 15.219f, 7.548f, 15.427f, 7.636f)
            lineTo(7.636f, 15.427f)
            curveTo(7.548f, 15.219f, 7.5f, 14.99f, 7.5f, 14.75f)
            verticalLineTo(13.684f)
            lineTo(13.684f, 7.5f)
            close()
            moveTo(9.25f, 16.5f)
            curveTo(9.078f, 16.5f, 8.912f, 16.475f, 8.755f, 16.429f)
            lineTo(16.429f, 8.755f)
            curveTo(16.475f, 8.912f, 16.5f, 9.078f, 16.5f, 9.25f)
            verticalLineTo(10.563f)
            lineTo(10.563f, 16.5f)
            horizontalLineTo(9.25f)
            close()
            moveTo(1f, 3.75f)
            curveTo(1f, 2.231f, 2.231f, 1f, 3.75f, 1f)
            horizontalLineTo(7.25f)
            curveTo(8.769f, 1f, 10f, 2.231f, 10f, 3.75f)
            verticalLineTo(7.25f)
            curveTo(10f, 8.769f, 8.769f, 10f, 7.25f, 10f)
            horizontalLineTo(3.75f)
            curveTo(2.231f, 10f, 1f, 8.769f, 1f, 7.25f)
            verticalLineTo(3.75f)
            close()
            moveTo(3.75f, 2.5f)
            curveTo(3.06f, 2.5f, 2.5f, 3.06f, 2.5f, 3.75f)
            verticalLineTo(7.25f)
            curveTo(2.5f, 7.94f, 3.06f, 8.5f, 3.75f, 8.5f)
            horizontalLineTo(7.25f)
            curveTo(7.94f, 8.5f, 8.5f, 7.94f, 8.5f, 7.25f)
            verticalLineTo(3.75f)
            curveTo(8.5f, 3.06f, 7.94f, 2.5f, 7.25f, 2.5f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PositionToBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PositionToBack, contentDescription = null)
    }
}
