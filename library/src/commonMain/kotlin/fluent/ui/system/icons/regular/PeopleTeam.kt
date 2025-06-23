/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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

public val FluentIcons.Regular.PeopleTeam: ImageVector
    get() {
        if (_PeopleTeam != null) {
            return _PeopleTeam!!
        }
        _PeopleTeam = ImageVector.Builder(
            name = "Regular.PeopleTeam",
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
                moveTo(14.754f, 11.5f)
                horizontalLineTo(9.252f)
                curveTo(9.114f, 11.5f, 9.002f, 11.612f, 9.002f, 11.75f)
                verticalLineTo(16.499f)
                curveTo(9.002f, 18.156f, 10.345f, 19.5f, 12.003f, 19.5f)
                curveTo(13.66f, 19.5f, 15.004f, 18.156f, 15.004f, 16.499f)
                verticalLineTo(11.75f)
                curveTo(15.004f, 11.612f, 14.892f, 11.5f, 14.754f, 11.5f)
                close()
                moveTo(3.75f, 10f)
                lineTo(7.131f, 9.999f)
                curveTo(6.788f, 10.415f, 6.564f, 10.932f, 6.513f, 11.5f)
                lineTo(3.75f, 11.5f)
                curveTo(3.612f, 11.5f, 3.5f, 11.612f, 3.5f, 11.75f)
                verticalLineTo(14.999f)
                curveTo(3.5f, 16.38f, 4.62f, 17.5f, 6.001f, 17.5f)
                curveTo(6.201f, 17.5f, 6.396f, 17.476f, 6.582f, 17.432f)
                curveTo(6.667f, 17.936f, 6.822f, 18.417f, 7.035f, 18.864f)
                curveTo(6.706f, 18.953f, 6.359f, 19f, 6.001f, 19f)
                curveTo(3.791f, 19f, 2f, 17.209f, 2f, 14.999f)
                verticalLineTo(11.75f)
                curveTo(2f, 10.783f, 2.783f, 10f, 3.75f, 10f)
                close()
                moveTo(16.875f, 9.999f)
                lineTo(20.25f, 10f)
                curveTo(21.216f, 10f, 22f, 10.783f, 22f, 11.75f)
                verticalLineTo(15f)
                curveTo(22f, 17.209f, 20.209f, 19f, 18f, 19f)
                curveTo(17.644f, 19f, 17.298f, 18.953f, 16.969f, 18.866f)
                curveTo(17.184f, 18.418f, 17.339f, 17.937f, 17.425f, 17.433f)
                curveTo(17.609f, 17.477f, 17.802f, 17.5f, 18f, 17.5f)
                curveTo(19.381f, 17.5f, 20.5f, 16.381f, 20.5f, 15f)
                verticalLineTo(11.75f)
                curveTo(20.5f, 11.612f, 20.388f, 11.5f, 20.25f, 11.5f)
                lineTo(17.493f, 11.5f)
                curveTo(17.442f, 10.932f, 17.218f, 10.415f, 16.875f, 9.999f)
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
                moveTo(12f, 4.5f)
                curveTo(11.172f, 4.5f, 10.5f, 5.172f, 10.5f, 6f)
                curveTo(10.5f, 6.828f, 11.172f, 7.5f, 12f, 7.5f)
                curveTo(12.828f, 7.5f, 13.5f, 6.828f, 13.5f, 6f)
                curveTo(13.5f, 5.172f, 12.828f, 4.5f, 12f, 4.5f)
                close()
                moveTo(18.5f, 5.5f)
                curveTo(17.948f, 5.5f, 17.5f, 5.948f, 17.5f, 6.5f)
                curveTo(17.5f, 7.052f, 17.948f, 7.5f, 18.5f, 7.5f)
                curveTo(19.052f, 7.5f, 19.5f, 7.052f, 19.5f, 6.5f)
                curveTo(19.5f, 5.948f, 19.052f, 5.5f, 18.5f, 5.5f)
                close()
                moveTo(5.5f, 5.5f)
                curveTo(4.948f, 5.5f, 4.5f, 5.948f, 4.5f, 6.5f)
                curveTo(4.5f, 7.052f, 4.948f, 7.5f, 5.5f, 7.5f)
                curveTo(6.052f, 7.5f, 6.5f, 7.052f, 6.5f, 6.5f)
                curveTo(6.5f, 5.948f, 6.052f, 5.5f, 5.5f, 5.5f)
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
        Image(imageVector = FluentIcons.Regular.PeopleTeam, contentDescription = null)
    }
}
