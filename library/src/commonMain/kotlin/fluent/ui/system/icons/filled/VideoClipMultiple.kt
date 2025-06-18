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

public val FluentUi.Filled.VideoClipMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoClipMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 3f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            verticalLineTo(15.25f)
            curveTo(2f, 17.045f, 3.455f, 18.5f, 5.25f, 18.5f)
            horizontalLineTo(15.75f)
            curveTo(17.545f, 18.5f, 19f, 17.045f, 19f, 15.25f)
            verticalLineTo(6.25f)
            curveTo(19f, 4.455f, 17.545f, 3f, 15.75f, 3f)
            horizontalLineTo(5.25f)
            close()
            moveTo(8f, 13.249f)
            verticalLineTo(7.752f)
            curveTo(8f, 7.159f, 8.655f, 6.801f, 9.155f, 7.121f)
            lineTo(13.773f, 10.08f)
            curveTo(14.08f, 10.276f, 14.08f, 10.725f, 13.773f, 10.922f)
            lineTo(9.155f, 13.881f)
            curveTo(8.655f, 14.201f, 8f, 13.842f, 8f, 13.249f)
            close()
            moveTo(7.75f, 21f)
            curveTo(6.599f, 21f, 5.588f, 20.402f, 5.011f, 19.5f)
            horizontalLineTo(16.25f)
            curveTo(18.321f, 19.5f, 20f, 17.821f, 20f, 15.75f)
            verticalLineTo(6.011f)
            curveTo(20.902f, 6.588f, 21.5f, 7.599f, 21.5f, 8.75f)
            verticalLineTo(15.75f)
            curveTo(21.5f, 18.649f, 19.149f, 21f, 16.25f, 21f)
            horizontalLineTo(7.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VideoClipMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VideoClipMultiple, contentDescription = null)
    }
}
