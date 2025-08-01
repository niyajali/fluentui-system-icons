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

public val FluentIcons.Regular.PeopleAudience: ImageVector
    get() {
        if (_PeopleAudience != null) {
            return _PeopleAudience!!
        }
        _PeopleAudience = ImageVector.Builder(
            name = "Regular.PeopleAudience",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.754f, 10f)
                curveTo(15.72f, 10f, 16.504f, 10.783f, 16.504f, 11.75f)
                verticalLineTo(15f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.25f)
                curveTo(16.5f, 15.664f, 16.164f, 16f, 15.75f, 16f)
                curveTo(15.336f, 16f, 15f, 15.664f, 15f, 15.25f)
                verticalLineTo(13f)
                horizontalLineTo(15.004f)
                verticalLineTo(11.75f)
                curveTo(15.004f, 11.612f, 14.892f, 11.5f, 14.754f, 11.5f)
                horizontalLineTo(9.252f)
                curveTo(9.114f, 11.5f, 9.002f, 11.612f, 9.002f, 11.75f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(15.25f)
                curveTo(9f, 15.664f, 8.664f, 16f, 8.25f, 16f)
                curveTo(7.836f, 16f, 7.5f, 15.664f, 7.5f, 15.25f)
                verticalLineTo(13f)
                horizontalLineTo(7.502f)
                verticalLineTo(11.75f)
                curveTo(7.502f, 10.783f, 8.285f, 10f, 9.252f, 10f)
                horizontalLineTo(14.754f)
                close()
                moveTo(20.5f, 11.75f)
                verticalLineTo(15.25f)
                curveTo(20.5f, 15.664f, 20.836f, 16f, 21.25f, 16f)
                curveTo(21.664f, 16f, 22f, 15.664f, 22f, 15.25f)
                verticalLineTo(11.75f)
                curveTo(22f, 10.783f, 21.216f, 10f, 20.25f, 10f)
                lineTo(16.875f, 9.999f)
                curveTo(17.218f, 10.415f, 17.442f, 10.932f, 17.493f, 11.5f)
                lineTo(20.25f, 11.5f)
                curveTo(20.388f, 11.5f, 20.5f, 11.612f, 20.5f, 11.75f)
                close()
                moveTo(2f, 15.25f)
                curveTo(2f, 15.664f, 2.336f, 16f, 2.75f, 16f)
                curveTo(3.164f, 16f, 3.5f, 15.664f, 3.5f, 15.25f)
                verticalLineTo(11.75f)
                curveTo(3.5f, 11.612f, 3.612f, 11.5f, 3.75f, 11.5f)
                lineTo(6.513f, 11.5f)
                curveTo(6.564f, 10.932f, 6.788f, 10.415f, 7.131f, 9.999f)
                lineTo(3.75f, 10f)
                curveTo(2.783f, 10f, 2f, 10.783f, 2f, 11.75f)
                verticalLineTo(15.25f)
                close()
                moveTo(12f, 3f)
                curveTo(13.657f, 3f, 15f, 4.343f, 15f, 6f)
                curveTo(15f, 7.657f, 13.657f, 9f, 12f, 9f)
                curveTo(10.343f, 9f, 9f, 7.657f, 9f, 6f)
                curveTo(9f, 4.343f, 10.343f, 3f, 12f, 3f)
                close()
                moveTo(12f, 4.5f)
                curveTo(11.172f, 4.5f, 10.5f, 5.172f, 10.5f, 6f)
                curveTo(10.5f, 6.828f, 11.172f, 7.5f, 12f, 7.5f)
                curveTo(12.828f, 7.5f, 13.5f, 6.828f, 13.5f, 6f)
                curveTo(13.5f, 5.172f, 12.828f, 4.5f, 12f, 4.5f)
                close()
                moveTo(18.5f, 4f)
                curveTo(19.881f, 4f, 21f, 5.119f, 21f, 6.5f)
                curveTo(21f, 7.881f, 19.881f, 9f, 18.5f, 9f)
                curveTo(17.119f, 9f, 16f, 7.881f, 16f, 6.5f)
                curveTo(16f, 5.119f, 17.119f, 4f, 18.5f, 4f)
                close()
                moveTo(18.5f, 5.5f)
                curveTo(17.948f, 5.5f, 17.5f, 5.948f, 17.5f, 6.5f)
                curveTo(17.5f, 7.052f, 17.948f, 7.5f, 18.5f, 7.5f)
                curveTo(19.052f, 7.5f, 19.5f, 7.052f, 19.5f, 6.5f)
                curveTo(19.5f, 5.948f, 19.052f, 5.5f, 18.5f, 5.5f)
                close()
                moveTo(5.5f, 4f)
                curveTo(6.881f, 4f, 8f, 5.119f, 8f, 6.5f)
                curveTo(8f, 7.881f, 6.881f, 9f, 5.5f, 9f)
                curveTo(4.119f, 9f, 3f, 7.881f, 3f, 6.5f)
                curveTo(3f, 5.119f, 4.119f, 4f, 5.5f, 4f)
                close()
                moveTo(5.5f, 5.5f)
                curveTo(4.948f, 5.5f, 4.5f, 5.948f, 4.5f, 6.5f)
                curveTo(4.5f, 7.052f, 4.948f, 7.5f, 5.5f, 7.5f)
                curveTo(6.052f, 7.5f, 6.5f, 7.052f, 6.5f, 6.5f)
                curveTo(6.5f, 5.948f, 6.052f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(2.75f, 17f)
                curveTo(2.336f, 17f, 2f, 17.336f, 2f, 17.75f)
                verticalLineTo(18.25f)
                curveTo(2f, 20.321f, 3.679f, 22f, 5.75f, 22f)
                horizontalLineTo(18.25f)
                curveTo(20.321f, 22f, 22f, 20.321f, 22f, 18.25f)
                verticalLineTo(17.75f)
                curveTo(22f, 17.336f, 21.664f, 17f, 21.25f, 17f)
                horizontalLineTo(2.75f)
                close()
                moveTo(5.75f, 20.5f)
                curveTo(4.592f, 20.5f, 3.638f, 19.625f, 3.514f, 18.5f)
                horizontalLineTo(20.486f)
                curveTo(20.362f, 19.625f, 19.408f, 20.5f, 18.25f, 20.5f)
                horizontalLineTo(5.75f)
                close()
            }
        }.build()

        return _PeopleAudience!!
    }

@Suppress("ObjectPropertyName")
private var _PeopleAudience: ImageVector? = null

@Preview
@Composable
private fun PeopleAudiencePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PeopleAudience, contentDescription = null)
    }
}
