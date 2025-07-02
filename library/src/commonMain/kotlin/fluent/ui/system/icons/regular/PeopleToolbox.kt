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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * PeopleToolbox icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: people, toolbox
 * - Source: ic_fluent_people_toolbox_20_regular.svg
 * 
 * @return The [ImageVector] for the PeopleToolbox icon.
 */
public val FluentIcons.Regular.PeopleToolbox: ImageVector
    get() {
        if (_peopleToolbox != null) {
            return _peopleToolbox!!
        }
        _peopleToolbox = Builder(name = "PeopleToolbox", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.75f, 3.5f)
                curveTo(5.507f, 3.5f, 4.5f, 4.507f, 4.5f, 5.75f)
                curveTo(4.5f, 6.993f, 5.507f, 8.0f, 6.75f, 8.0f)
                curveTo(7.993f, 8.0f, 9.0f, 6.993f, 9.0f, 5.75f)
                curveTo(9.0f, 4.507f, 7.993f, 3.5f, 6.75f, 3.5f)
                close()
                moveTo(3.5f, 5.75f)
                curveTo(3.5f, 3.955f, 4.955f, 2.5f, 6.75f, 2.5f)
                curveTo(8.545f, 2.5f, 10.0f, 3.955f, 10.0f, 5.75f)
                curveTo(10.0f, 7.545f, 8.545f, 9.0f, 6.75f, 9.0f)
                curveTo(4.955f, 9.0f, 3.5f, 7.545f, 3.5f, 5.75f)
                close()
                moveTo(14.5f, 9.0f)
                curveTo(13.119f, 9.0f, 12.0f, 7.881f, 12.0f, 6.5f)
                curveTo(12.0f, 5.119f, 13.119f, 4.0f, 14.5f, 4.0f)
                curveTo(15.881f, 4.0f, 17.0f, 5.119f, 17.0f, 6.5f)
                curveTo(17.0f, 7.881f, 15.881f, 9.0f, 14.5f, 9.0f)
                close()
                moveTo(11.24f, 10.431f)
                curveTo(10.899f, 10.161f, 10.468f, 10.0f, 10.0f, 10.0f)
                horizontalLineTo(3.5f)
                curveTo(2.395f, 10.0f, 1.5f, 10.895f, 1.5f, 12.0f)
                verticalLineTo(12.063f)
                lineTo(1.5f, 12.064f)
                lineTo(1.5f, 12.066f)
                lineTo(1.5f, 12.071f)
                lineTo(1.5f, 12.083f)
                curveTo(1.5f, 12.094f, 1.501f, 12.107f, 1.502f, 12.124f)
                curveTo(1.503f, 12.157f, 1.506f, 12.203f, 1.512f, 12.259f)
                curveTo(1.523f, 12.372f, 1.544f, 12.527f, 1.587f, 12.712f)
                curveTo(1.672f, 13.08f, 1.841f, 13.572f, 2.182f, 14.066f)
                curveTo(2.883f, 15.08f, 4.237f, 16.0f, 6.75f, 16.0f)
                curveTo(7.637f, 16.0f, 8.38f, 15.885f, 9.0f, 15.693f)
                verticalLineTo(14.634f)
                curveTo(8.436f, 14.855f, 7.703f, 15.0f, 6.75f, 15.0f)
                curveTo(4.513f, 15.0f, 3.492f, 14.201f, 3.005f, 13.497f)
                curveTo(2.752f, 13.131f, 2.625f, 12.764f, 2.561f, 12.487f)
                curveTo(2.53f, 12.35f, 2.514f, 12.237f, 2.507f, 12.161f)
                curveTo(2.503f, 12.123f, 2.501f, 12.095f, 2.501f, 12.078f)
                lineTo(2.5f, 12.061f)
                lineTo(2.5f, 12.06f)
                verticalLineTo(12.0f)
                curveTo(2.5f, 11.448f, 2.948f, 11.0f, 3.5f, 11.0f)
                horizontalLineTo(10.0f)
                curveTo(10.212f, 11.0f, 10.409f, 11.066f, 10.57f, 11.179f)
                curveTo(10.721f, 11.118f, 10.879f, 11.072f, 11.042f, 11.042f)
                curveTo(11.082f, 10.827f, 11.149f, 10.622f, 11.24f, 10.431f)
                close()
                moveTo(14.5f, 5.0f)
                curveTo(13.672f, 5.0f, 13.0f, 5.672f, 13.0f, 6.5f)
                curveTo(13.0f, 7.328f, 13.672f, 8.0f, 14.5f, 8.0f)
                curveTo(15.328f, 8.0f, 16.0f, 7.328f, 16.0f, 6.5f)
                curveTo(16.0f, 5.672f, 15.328f, 5.0f, 14.5f, 5.0f)
                close()
                moveTo(12.0f, 12.0f)
                verticalLineTo(11.5f)
                curveTo(12.0f, 10.672f, 12.672f, 10.0f, 13.5f, 10.0f)
                horizontalLineTo(15.5f)
                curveTo(16.328f, 10.0f, 17.0f, 10.672f, 17.0f, 11.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 12.0f, 19.0f, 12.672f, 19.0f, 13.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 14.224f, 16.776f, 14.0f, 16.5f, 14.0f)
                curveTo(16.224f, 14.0f, 16.0f, 14.224f, 16.0f, 14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.5f)
                curveTo(13.0f, 14.224f, 12.776f, 14.0f, 12.5f, 14.0f)
                curveTo(12.224f, 14.0f, 12.0f, 14.224f, 12.0f, 14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.5f)
                curveTo(10.0f, 12.672f, 10.672f, 12.0f, 11.5f, 12.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(13.0f, 11.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.5f)
                curveTo(16.0f, 11.224f, 15.776f, 11.0f, 15.5f, 11.0f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 11.0f, 13.0f, 11.224f, 13.0f, 11.5f)
                close()
                moveTo(17.0f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.5f)
                curveTo(19.0f, 18.328f, 18.328f, 19.0f, 17.5f, 19.0f)
                horizontalLineTo(11.5f)
                curveTo(10.672f, 19.0f, 10.0f, 18.328f, 10.0f, 17.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.5f)
                curveTo(12.0f, 16.776f, 12.224f, 17.0f, 12.5f, 17.0f)
                curveTo(12.776f, 17.0f, 13.0f, 16.776f, 13.0f, 16.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.5f)
                curveTo(16.0f, 16.776f, 16.224f, 17.0f, 16.5f, 17.0f)
                curveTo(16.776f, 17.0f, 17.0f, 16.776f, 17.0f, 16.5f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _peopleToolbox!!
    }

@Suppress("ObjectPropertyName")
private var _peopleToolbox: ImageVector? = null

@Preview
@Composable
private fun PeopleToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PeopleToolbox, contentDescription = null)
    }
}

