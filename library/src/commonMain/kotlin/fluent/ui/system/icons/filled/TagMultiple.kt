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

public val FluentUi.Filled.TagMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TagMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.751f, 2f)
            curveTo(11.915f, 2f, 11.112f, 2.322f, 10.508f, 2.898f)
            lineTo(3.696f, 9.395f)
            curveTo(2.78f, 10.268f, 2.765f, 11.725f, 3.662f, 12.618f)
            lineTo(9.918f, 18.844f)
            curveTo(10.793f, 19.715f, 12.205f, 19.719f, 13.084f, 18.854f)
            lineTo(20.029f, 12.019f)
            curveTo(20.65f, 11.408f, 21f, 10.574f, 21f, 9.703f)
            verticalLineTo(4.75f)
            curveTo(21f, 3.231f, 19.768f, 2f, 18.25f, 2f)
            horizontalLineTo(12.751f)
            close()
            moveTo(16.25f, 7.75f)
            curveTo(15.56f, 7.75f, 15f, 7.19f, 15f, 6.5f)
            curveTo(15f, 5.81f, 15.56f, 5.25f, 16.25f, 5.25f)
            curveTo(16.94f, 5.25f, 17.5f, 5.81f, 17.5f, 6.5f)
            curveTo(17.5f, 7.19f, 16.94f, 7.75f, 16.25f, 7.75f)
            close()
            moveTo(19.256f, 14.183f)
            lineTo(20.731f, 12.732f)
            curveTo(20.776f, 12.688f, 20.82f, 12.642f, 20.863f, 12.596f)
            curveTo(21.173f, 13.554f, 20.945f, 14.651f, 20.172f, 15.409f)
            lineTo(14.838f, 20.638f)
            curveTo(12.985f, 22.454f, 10.017f, 22.448f, 8.172f, 20.622f)
            lineTo(3.816f, 16.311f)
            curveTo(3.051f, 15.554f, 2.824f, 14.461f, 3.135f, 13.504f)
            lineTo(4.764f, 15.125f)
            curveTo(4.796f, 15.167f, 4.832f, 15.207f, 4.871f, 15.245f)
            lineTo(7.282f, 17.631f)
            lineTo(9.213f, 19.553f)
            curveTo(10.269f, 20.604f, 11.866f, 20.78f, 13.104f, 20.081f)
            curveTo(13.348f, 19.943f, 13.579f, 19.772f, 13.788f, 19.566f)
            lineTo(19.122f, 14.338f)
            curveTo(19.171f, 14.289f, 19.216f, 14.238f, 19.256f, 14.183f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TagMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TagMultiple, contentDescription = null)
    }
}
