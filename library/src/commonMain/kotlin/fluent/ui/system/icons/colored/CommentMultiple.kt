package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.CommentMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.CommentMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFFCD3E1D))) {
            moveTo(4.5f, 6.75f)
            curveTo(4.5f, 4.955f, 5.955f, 3.5f, 7.75f, 3.5f)
            horizontalLineTo(15.75f)
            curveTo(18.926f, 3.5f, 21.5f, 6.074f, 21.5f, 9.25f)
            verticalLineTo(13.25f)
            curveTo(21.5f, 15.045f, 20.045f, 16.5f, 18.25f, 16.5f)
            horizontalLineTo(9f)
            curveTo(6.515f, 16.5f, 4.5f, 14.485f, 4.5f, 12f)
            verticalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFAB500),
                    0.535f to Color(0xFFFE8401),
                    1f to Color(0xFFFB5937)
                ),
                center = Offset(-1.923f, 1.076f),
                radius = 30.387f
            )
        ) {
            moveTo(2f, 9.25f)
            curveTo(2f, 7.455f, 3.455f, 6f, 5.25f, 6f)
            horizontalLineTo(15.75f)
            curveTo(17.545f, 6f, 19f, 7.455f, 19f, 9.25f)
            verticalLineTo(15.75f)
            curveTo(19f, 17.545f, 17.545f, 19f, 15.75f, 19f)
            horizontalLineTo(10.748f)
            lineTo(6.99f, 21.76f)
            curveTo(6.164f, 22.366f, 5f, 21.776f, 5f, 20.752f)
            verticalLineTo(18.99f)
            curveTo(3.322f, 18.863f, 2f, 17.461f, 2f, 15.75f)
            verticalLineTo(9.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.CommentMultiple, contentDescription = null)
    }
}
