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

public val FluentUi.Filled.PersonSquare: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonSquare",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            close()
            moveTo(15.5f, 12f)
            curveTo(16.328f, 12f, 17f, 12.672f, 17f, 13.5f)
            verticalLineTo(14f)
            curveTo(17f, 15.971f, 15.141f, 18f, 12f, 18f)
            curveTo(8.86f, 18f, 7f, 15.971f, 7f, 14f)
            verticalLineTo(13.5f)
            curveTo(7f, 12.672f, 7.672f, 12f, 8.5f, 12f)
            horizontalLineTo(15.5f)
            close()
            moveTo(12f, 5.5f)
            curveTo(13.519f, 5.5f, 14.75f, 6.731f, 14.75f, 8.25f)
            curveTo(14.75f, 9.769f, 13.519f, 11f, 12f, 11f)
            curveTo(10.481f, 11f, 9.25f, 9.769f, 9.25f, 8.25f)
            curveTo(9.25f, 6.731f, 10.481f, 5.5f, 12f, 5.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PersonSquare, contentDescription = null)
    }
}
