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

public val FluentUi.Filled.TextColumnOneWideLightning: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColumnOneWideLightning",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 5f)
            curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
            curveTo(3f, 6.552f, 3.448f, 7f, 4f, 7f)
            horizontalLineTo(20f)
            curveTo(20.552f, 7f, 21f, 6.552f, 21f, 6f)
            curveTo(21f, 5.448f, 20.552f, 5f, 20f, 5f)
            horizontalLineTo(4f)
            close()
            moveTo(4f, 9f)
            curveTo(3.448f, 9f, 3f, 9.448f, 3f, 10f)
            curveTo(3f, 10.552f, 3.448f, 11f, 4f, 11f)
            horizontalLineTo(13.395f)
            lineTo(13.462f, 10.858f)
            curveTo(13.711f, 10.334f, 14.238f, 10f, 14.818f, 10f)
            horizontalLineTo(21f)
            curveTo(21f, 9.448f, 20.552f, 9f, 20f, 9f)
            horizontalLineTo(4f)
            close()
            moveTo(4f, 13f)
            horizontalLineTo(12.448f)
            lineTo(11.5f, 15f)
            horizontalLineTo(4f)
            curveTo(3.448f, 15f, 3f, 14.552f, 3f, 14f)
            curveTo(3f, 13.448f, 3.448f, 13f, 4f, 13f)
            close()
            moveTo(4f, 17f)
            horizontalLineTo(10.553f)
            lineTo(10.146f, 17.858f)
            curveTo(9.965f, 18.241f, 9.961f, 18.646f, 10.087f, 19f)
            horizontalLineTo(4f)
            curveTo(3.448f, 19f, 3f, 18.552f, 3f, 18f)
            curveTo(3f, 17.448f, 3.448f, 17f, 4f, 17f)
            close()
            moveTo(14.811f, 11f)
            horizontalLineTo(21.13f)
            curveTo(21.512f, 11f, 21.753f, 11.413f, 21.565f, 11.748f)
            lineTo(19.737f, 15.016f)
            horizontalLineTo(21.25f)
            curveTo(21.89f, 15.016f, 22.235f, 15.771f, 21.817f, 16.26f)
            lineTo(15.411f, 23.741f)
            curveTo(14.89f, 24.35f, 13.915f, 23.793f, 14.167f, 23.031f)
            lineTo(15.494f, 19.031f)
            horizontalLineTo(11.5f)
            curveTo(11.133f, 19.031f, 10.892f, 18.647f, 11.049f, 18.314f)
            lineTo(14.36f, 11.287f)
            curveTo(14.443f, 11.112f, 14.618f, 11f, 14.811f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextColumnOneWideLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextColumnOneWideLightning, contentDescription = null)
    }
}
