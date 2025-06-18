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

public val FluentUi.Regular.ImageMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.748f, 8.996f)
            curveTo(14.438f, 8.996f, 14.996f, 8.438f, 14.996f, 7.748f)
            curveTo(14.996f, 7.059f, 14.438f, 6.5f, 13.748f, 6.5f)
            curveTo(13.059f, 6.5f, 12.5f, 7.059f, 12.5f, 7.748f)
            curveTo(12.5f, 8.438f, 13.059f, 8.996f, 13.748f, 8.996f)
            close()
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(15.25f)
            curveTo(3f, 17.045f, 4.455f, 18.5f, 6.25f, 18.5f)
            horizontalLineTo(15.25f)
            curveTo(17.045f, 18.5f, 18.5f, 17.045f, 18.5f, 15.25f)
            verticalLineTo(6.25f)
            curveTo(18.5f, 4.455f, 17.045f, 3f, 15.25f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(4.5f, 6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(15.25f)
            curveTo(16.216f, 4.5f, 17f, 5.284f, 17f, 6.25f)
            verticalLineTo(15.25f)
            curveTo(17f, 15.481f, 16.955f, 15.702f, 16.874f, 15.904f)
            lineTo(12.287f, 11.613f)
            curveTo(11.422f, 10.804f, 10.078f, 10.804f, 9.213f, 11.613f)
            lineTo(4.626f, 15.903f)
            curveTo(4.545f, 15.701f, 4.5f, 15.481f, 4.5f, 15.25f)
            verticalLineTo(6.25f)
            close()
            moveTo(11.262f, 12.708f)
            lineTo(15.767f, 16.922f)
            curveTo(15.604f, 16.973f, 15.43f, 17f, 15.25f, 17f)
            horizontalLineTo(6.25f)
            curveTo(6.07f, 17f, 5.896f, 16.973f, 5.733f, 16.922f)
            lineTo(10.237f, 12.708f)
            curveTo(10.526f, 12.439f, 10.974f, 12.439f, 11.262f, 12.708f)
            close()
            moveTo(8.75f, 21f)
            curveTo(7.599f, 21f, 6.588f, 20.402f, 6.011f, 19.5f)
            horizontalLineTo(8.724f)
            lineTo(8.75f, 19.5f)
            horizontalLineTo(15.75f)
            curveTo(17.821f, 19.5f, 19.5f, 17.821f, 19.5f, 15.75f)
            verticalLineTo(6.011f)
            curveTo(20.402f, 6.589f, 21f, 7.6f, 21f, 8.75f)
            verticalLineTo(15.75f)
            curveTo(21f, 18.65f, 18.649f, 21f, 15.75f, 21f)
            horizontalLineTo(8.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ImageMultiple, contentDescription = null)
    }
}
