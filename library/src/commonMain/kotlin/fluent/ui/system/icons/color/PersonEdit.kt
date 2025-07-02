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

package fluent.ui.system.icons.color

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Brush.Companion.radialGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * PersonEdit icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Color
 * - Size: 32dp
 * - Keywords: person, edit
 * - Source: ic_fluent_person_edit_32_color.svg
 * 
 * @return The [ImageVector] for the PersonEdit icon.
 */
public val FluentIcons.Color.PersonEdit: ImageVector
    get() {
        if (_personEdit != null) {
            return _personEdit!!
        }
        _personEdit = Builder(name = "PersonEdit", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = linearGradient(0.125f to Color(0xFF9C6CFE), 1.0f to Color(0xFF7A41DC), start = Offset(9.707f,19.595f), end = Offset(13.584f,31.977f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(25.125f, 18.056f)
                verticalLineTo(22.222f)
                lineTo(17.03f, 29.971f)
                curveTo(16.69f, 29.99f, 16.347f, 30.0f, 16.0f, 30.0f)
                curveTo(12.802f, 30.0f, 9.859f, 29.177f, 7.685f, 27.793f)
                curveTo(5.523f, 26.417f, 4.0f, 24.393f, 4.0f, 22.0f)
                lineTo(4.0f, 21.5f)
                curveTo(4.0f, 19.567f, 5.567f, 18.0f, 7.5f, 18.0f)
                horizontalLineTo(24.5f)
                curveTo(24.713f, 18.0f, 24.922f, 18.019f, 25.125f, 18.056f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0x00885EDB), 1.0f to Color(0xFFE362F8), start = Offset(16.0f,16.571f), end = Offset(21.429f,36.857f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(25.125f, 18.056f)
                verticalLineTo(22.222f)
                lineTo(17.03f, 29.971f)
                curveTo(16.69f, 29.99f, 16.347f, 30.0f, 16.0f, 30.0f)
                curveTo(12.802f, 30.0f, 9.859f, 29.177f, 7.685f, 27.793f)
                curveTo(5.523f, 26.417f, 4.0f, 24.393f, 4.0f, 22.0f)
                lineTo(4.0f, 21.5f)
                curveTo(4.0f, 19.567f, 5.567f, 18.0f, 7.5f, 18.0f)
                horizontalLineTo(24.5f)
                curveTo(24.713f, 18.0f, 24.922f, 18.019f, 25.125f, 18.056f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xBF0A1852), 1.0f to Color(0x000A1852), center = Offset(20.724f,34.286f), radius = 18.947f), stroke = null, fillAlpha = 0.75f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(25.125f, 18.056f)
                verticalLineTo(22.222f)
                lineTo(17.03f, 29.971f)
                curveTo(16.69f, 29.99f, 16.347f, 30.0f, 16.0f, 30.0f)
                curveTo(12.802f, 30.0f, 9.859f, 29.177f, 7.685f, 27.793f)
                curveTo(5.523f, 26.417f, 4.0f, 24.393f, 4.0f, 22.0f)
                lineTo(4.0f, 21.5f)
                curveTo(4.0f, 19.567f, 5.567f, 18.0f, 7.5f, 18.0f)
                horizontalLineTo(24.5f)
                curveTo(24.713f, 18.0f, 24.922f, 18.019f, 25.125f, 18.056f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xBF0A1852), 1.0f to Color(0x000A1852), center = Offset(26.0f,21.5f), radius = 5.5f), stroke = null, fillAlpha = 0.75f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(25.125f, 18.056f)
                verticalLineTo(22.222f)
                lineTo(17.03f, 29.971f)
                curveTo(16.69f, 29.99f, 16.347f, 30.0f, 16.0f, 30.0f)
                curveTo(12.802f, 30.0f, 9.859f, 29.177f, 7.685f, 27.793f)
                curveTo(5.523f, 26.417f, 4.0f, 24.393f, 4.0f, 22.0f)
                lineTo(4.0f, 21.5f)
                curveTo(4.0f, 19.567f, 5.567f, 18.0f, 7.5f, 18.0f)
                horizontalLineTo(24.5f)
                curveTo(24.713f, 18.0f, 24.922f, 18.019f, 25.125f, 18.056f)
                close()
            }
            path(fill = linearGradient(0.125f to Color(0xFF9C6CFE), 1.0f to Color(0xFF7A41DC), start = Offset(12.329f,3.861f), end = Offset(19.464f,15.254f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 16.0f)
                curveTo(19.866f, 16.0f, 23.0f, 12.866f, 23.0f, 9.0f)
                curveTo(23.0f, 5.134f, 19.866f, 2.0f, 16.0f, 2.0f)
                curveTo(12.134f, 2.0f, 9.0f, 5.134f, 9.0f, 9.0f)
                curveTo(9.0f, 12.866f, 12.134f, 16.0f, 16.0f, 16.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFA43D), 1.0f to Color(0xFFFB5937), start = Offset(20.861f,19.948f), end = Offset(27.044f,26.149f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.539f, 29.469f)
                lineTo(29.148f, 21.926f)
                lineTo(29.149f, 17.852f)
                horizontalLineTo(25.076f)
                lineTo(17.509f, 25.492f)
                lineTo(17.817f, 29.187f)
                lineTo(21.539f, 29.469f)
                close()
            }
            path(fill = linearGradient(0.255f to Color(0xFFFFD394), 1.0f to Color(0xFFFF921F), start = Offset(15.174f,26.847f), end = Offset(19.325f,30.975f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.539f, 29.469f)
                curveTo(21.614f, 29.395f, 21.688f, 29.321f, 21.762f, 29.247f)
                curveTo(21.762f, 29.247f, 20.036f, 28.586f, 19.227f, 27.777f)
                curveTo(18.418f, 26.968f, 17.757f, 25.243f, 17.757f, 25.243f)
                curveTo(17.757f, 25.243f, 17.592f, 25.408f, 17.509f, 25.492f)
                curveTo(17.178f, 25.826f, 16.941f, 26.242f, 16.823f, 26.698f)
                lineTo(16.033f, 29.749f)
                curveTo(15.842f, 30.486f, 16.512f, 31.158f, 17.25f, 30.968f)
                lineTo(20.269f, 30.191f)
                curveTo(20.749f, 30.067f, 21.187f, 29.818f, 21.539f, 29.469f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF97DBD), 1.0f to Color(0xFFDD3CE2), start = Offset(29.502f,17.485f), end = Offset(26.869f,19.969f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(27.937f, 23.14f)
                lineTo(30.148f, 20.926f)
                curveTo(31.255f, 19.828f, 31.287f, 18.047f, 30.22f, 16.909f)
                curveTo(29.104f, 15.72f, 27.224f, 15.694f, 26.076f, 16.852f)
                lineTo(23.838f, 19.094f)
                lineTo(27.937f, 23.14f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFF921F), 1.0f to Color(0xFFFFE994), start = Offset(26.469f,21.664f), end = Offset(22.489f,19.902f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(25.094f, 17.838f)
                curveTo(25.574f, 19.852f, 27.175f, 21.43f, 29.2f, 21.876f)
                lineTo(27.65f, 23.427f)
                curveTo(25.624f, 22.982f, 24.023f, 21.402f, 23.544f, 19.387f)
                lineTo(25.094f, 17.838f)
                close()
            }
        }
        .build()
        return _personEdit!!
    }

@Suppress("ObjectPropertyName")
private var _personEdit: ImageVector? = null

@Preview
@Composable
private fun PersonEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.PersonEdit, contentDescription = null)
    }
}

