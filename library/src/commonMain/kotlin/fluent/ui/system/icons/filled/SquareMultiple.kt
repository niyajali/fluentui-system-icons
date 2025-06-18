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

public val FluentUi.Filled.SquareMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.518f, 5f)
            horizontalLineTo(6.009f)
            curveTo(6.137f, 3.322f, 7.539f, 2f, 9.25f, 2f)
            horizontalLineTo(17.25f)
            curveTo(19.873f, 2f, 22f, 4.127f, 22f, 6.75f)
            verticalLineTo(14.75f)
            curveTo(22f, 16.461f, 20.678f, 17.863f, 19f, 17.99f)
            verticalLineTo(16.482f)
            curveTo(19.848f, 16.361f, 20.5f, 15.632f, 20.5f, 14.75f)
            verticalLineTo(6.75f)
            curveTo(20.5f, 4.955f, 19.045f, 3.5f, 17.25f, 3.5f)
            horizontalLineTo(9.25f)
            curveTo(8.368f, 3.5f, 7.639f, 4.152f, 7.518f, 5f)
            close()
            moveTo(5.25f, 6f)
            curveTo(3.455f, 6f, 2f, 7.455f, 2f, 9.25f)
            verticalLineTo(18.75f)
            curveTo(2f, 20.545f, 3.455f, 22f, 5.25f, 22f)
            horizontalLineTo(14.75f)
            curveTo(16.545f, 22f, 18f, 20.545f, 18f, 18.75f)
            verticalLineTo(9.25f)
            curveTo(18f, 7.455f, 16.545f, 6f, 14.75f, 6f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SquareMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SquareMultiple, contentDescription = null)
    }
}
