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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ClothesHanger: ImageVector
    get() {
        if (_ClothesHanger != null) {
            return _ClothesHanger!!
        }
        _ClothesHanger = ImageVector.Builder(
            name = "Regular.ClothesHanger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 4.5f)
                curveTo(11.348f, 4.5f, 10.792f, 4.916f, 10.585f, 5.5f)
                curveTo(10.447f, 5.89f, 10.019f, 6.095f, 9.628f, 5.957f)
                curveTo(9.238f, 5.819f, 9.033f, 5.39f, 9.171f, 5f)
                curveTo(9.583f, 3.836f, 10.693f, 3f, 12f, 3f)
                curveTo(13.657f, 3f, 15f, 4.343f, 15f, 6f)
                curveTo(15f, 7f, 14.51f, 7.886f, 13.759f, 8.43f)
                curveTo(13.458f, 8.649f, 13.191f, 8.868f, 13.002f, 9.097f)
                curveTo(12.816f, 9.323f, 12.75f, 9.504f, 12.75f, 9.66f)
                curveTo(12.75f, 9.902f, 12.883f, 10.125f, 13.096f, 10.24f)
                lineTo(20.703f, 14.352f)
                curveTo(21.502f, 14.784f, 22f, 15.619f, 22f, 16.527f)
                curveTo(22f, 17.893f, 20.893f, 19f, 19.527f, 19f)
                horizontalLineTo(4.473f)
                curveTo(3.107f, 19f, 2f, 17.893f, 2f, 16.527f)
                curveTo(2f, 15.619f, 2.498f, 14.784f, 3.297f, 14.352f)
                lineTo(9.397f, 11.054f)
                curveTo(9.762f, 10.857f, 10.217f, 10.993f, 10.414f, 11.358f)
                curveTo(10.611f, 11.722f, 10.475f, 12.177f, 10.111f, 12.374f)
                lineTo(4.01f, 15.671f)
                curveTo(3.696f, 15.841f, 3.5f, 16.17f, 3.5f, 16.527f)
                curveTo(3.5f, 17.064f, 3.936f, 17.5f, 4.473f, 17.5f)
                horizontalLineTo(19.527f)
                curveTo(20.064f, 17.5f, 20.5f, 17.064f, 20.5f, 16.527f)
                curveTo(20.5f, 16.17f, 20.304f, 15.841f, 19.99f, 15.671f)
                lineTo(12.383f, 11.559f)
                curveTo(11.685f, 11.182f, 11.25f, 10.453f, 11.25f, 9.66f)
                curveTo(11.25f, 9.036f, 11.528f, 8.528f, 11.844f, 8.144f)
                curveTo(12.158f, 7.763f, 12.55f, 7.454f, 12.879f, 7.216f)
                curveTo(13.257f, 6.942f, 13.5f, 6.499f, 13.5f, 6f)
                curveTo(13.5f, 5.172f, 12.828f, 4.5f, 12f, 4.5f)
                close()
            }
        }.build()

        return _ClothesHanger!!
    }

@Suppress("ObjectPropertyName")
private var _ClothesHanger: ImageVector? = null

@Preview
@Composable
private fun ClothesHangerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClothesHanger, contentDescription = null)
    }
}
