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
 * ProhibitedSmoking Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent unauthorized smoking areas or restrictions.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_prohibited_smoking_20_regular.svg)
 * 
 * @return The [ImageVector] for the ProhibitedSmoking icon.
 */
public val FluentIcons.Regular.ProhibitedSmoking: ImageVector
    get() {
        if (_prohibitedSmoking != null) {
            return _prohibitedSmoking!!
        }
        _prohibitedSmoking = Builder(name = "ProhibitedSmoking", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(14.418f, 2.0f, 18.0f, 5.582f, 18.0f, 10.0f)
                curveTo(18.0f, 14.418f, 14.418f, 18.0f, 10.0f, 18.0f)
                curveTo(5.582f, 18.0f, 2.0f, 14.418f, 2.0f, 10.0f)
                curveTo(2.0f, 5.582f, 5.582f, 2.0f, 10.0f, 2.0f)
                close()
                moveTo(10.707f, 10.0f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 10.0f, 15.0f, 10.224f, 15.0f, 10.5f)
                verticalLineTo(11.5f)
                curveTo(15.0f, 11.776f, 14.776f, 12.0f, 14.5f, 12.0f)
                horizontalLineTo(8.707f)
                lineTo(5.416f, 15.291f)
                curveTo(6.644f, 16.356f, 8.247f, 17.0f, 10.0f, 17.0f)
                curveTo(13.866f, 17.0f, 17.0f, 13.866f, 17.0f, 10.0f)
                curveTo(17.0f, 8.247f, 16.356f, 6.644f, 15.291f, 5.416f)
                lineTo(10.707f, 10.0f)
                close()
                moveTo(10.0f, 3.0f)
                curveTo(6.134f, 3.0f, 3.0f, 6.134f, 3.0f, 10.0f)
                curveTo(3.0f, 11.753f, 3.644f, 13.356f, 4.709f, 14.584f)
                lineTo(7.293f, 12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.293f)
                lineTo(14.584f, 4.709f)
                curveTo(13.356f, 3.644f, 11.753f, 3.0f, 10.0f, 3.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 12.0f, 5.0f, 11.776f, 5.0f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(5.0f, 10.224f, 5.224f, 10.0f, 5.5f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(6.0f, 5.636f)
                curveTo(6.0f, 5.477f, 6.213f, 5.427f, 6.284f, 5.568f)
                lineTo(6.678f, 6.355f)
                curveTo(6.87f, 6.74f, 6.795f, 7.205f, 6.49f, 7.51f)
                lineTo(6.293f, 7.707f)
                curveTo(6.105f, 7.895f, 6.0f, 8.149f, 6.0f, 8.414f)
                verticalLineTo(9.441f)
                curveTo(6.0f, 9.705f, 5.644f, 9.789f, 5.526f, 9.553f)
                lineTo(5.119f, 8.737f)
                curveTo(4.766f, 8.03f, 4.994f, 7.171f, 5.651f, 6.732f)
                curveTo(5.869f, 6.587f, 6.0f, 6.343f, 6.0f, 6.081f)
                verticalLineTo(5.636f)
                close()
            }
        }
        .build()
        return _prohibitedSmoking!!
    }

@Suppress("ObjectPropertyName")
private var _prohibitedSmoking: ImageVector? = null

@Preview
@Composable
private fun ProhibitedSmokingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ProhibitedSmoking, contentDescription = "ProhibitedSmoking Icon")
    }
}

