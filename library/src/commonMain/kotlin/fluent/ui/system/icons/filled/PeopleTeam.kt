package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.PeopleTeam: ImageVector
    get() {
        if (_PeopleTeam != null) {
            return _PeopleTeam!!
        }
        _PeopleTeam = ImageVector.Builder(
            name = "Filled.PeopleTeam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.754f, 10f)
                curveTo(15.72f, 10f, 16.504f, 10.783f, 16.504f, 11.75f)
                verticalLineTo(16.499f)
                curveTo(16.504f, 18.985f, 14.489f, 21f, 12.003f, 21f)
                curveTo(9.517f, 21f, 7.502f, 18.985f, 7.502f, 16.499f)
                verticalLineTo(11.75f)
                curveTo(7.502f, 10.783f, 8.285f, 10f, 9.252f, 10f)
                horizontalLineTo(14.754f)
                close()
                moveTo(7.131f, 9.999f)
                curveTo(6.782f, 10.422f, 6.556f, 10.951f, 6.511f, 11.53f)
                lineTo(6.502f, 11.75f)
                verticalLineTo(16.499f)
                curveTo(6.502f, 17.346f, 6.693f, 18.148f, 7.035f, 18.864f)
                curveTo(6.706f, 18.953f, 6.359f, 19f, 6.001f, 19f)
                curveTo(3.791f, 19f, 2f, 17.209f, 2f, 14.999f)
                verticalLineTo(11.75f)
                curveTo(2f, 10.832f, 2.707f, 10.079f, 3.606f, 10.006f)
                lineTo(3.75f, 10f)
                lineTo(7.131f, 9.999f)
                close()
                moveTo(16.875f, 9.999f)
                lineTo(20.25f, 10f)
                curveTo(21.216f, 10f, 22f, 10.783f, 22f, 11.75f)
                verticalLineTo(15f)
                curveTo(22f, 17.209f, 20.209f, 19f, 18f, 19f)
                curveTo(17.644f, 19f, 17.298f, 18.953f, 16.969f, 18.866f)
                curveTo(17.27f, 18.238f, 17.454f, 17.545f, 17.495f, 16.814f)
                lineTo(17.504f, 16.499f)
                verticalLineTo(11.75f)
                curveTo(17.504f, 11.085f, 17.268f, 10.475f, 16.875f, 9.999f)
                close()
                moveTo(12f, 3f)
                curveTo(13.657f, 3f, 15f, 4.343f, 15f, 6f)
                curveTo(15f, 7.657f, 13.657f, 9f, 12f, 9f)
                curveTo(10.343f, 9f, 9f, 7.657f, 9f, 6f)
                curveTo(9f, 4.343f, 10.343f, 3f, 12f, 3f)
                close()
                moveTo(18.5f, 4f)
                curveTo(19.881f, 4f, 21f, 5.119f, 21f, 6.5f)
                curveTo(21f, 7.881f, 19.881f, 9f, 18.5f, 9f)
                curveTo(17.119f, 9f, 16f, 7.881f, 16f, 6.5f)
                curveTo(16f, 5.119f, 17.119f, 4f, 18.5f, 4f)
                close()
                moveTo(5.5f, 4f)
                curveTo(6.881f, 4f, 8f, 5.119f, 8f, 6.5f)
                curveTo(8f, 7.881f, 6.881f, 9f, 5.5f, 9f)
                curveTo(4.119f, 9f, 3f, 7.881f, 3f, 6.5f)
                curveTo(3f, 5.119f, 4.119f, 4f, 5.5f, 4f)
                close()
            }
        }.build()

        return _PeopleTeam!!
    }

@Suppress("ObjectPropertyName")
private var _PeopleTeam: ImageVector? = null

@Preview
@Composable
private fun PeopleTeamPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PeopleTeam, contentDescription = null)
    }
}
