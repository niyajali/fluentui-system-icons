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
 * SubtractCircleArrowForward Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in maximize/minimize & block scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_subtract_circle_arrow_forward_20_regular.svg)
 * 
 * @return The [ImageVector] for the SubtractCircleArrowForward icon.
 */
public val FluentIcons.Regular.SubtractCircleArrowForward: ImageVector
    get() {
        if (_subtractCircleArrowForward != null) {
            return _subtractCircleArrowForward!!
        }
        _subtractCircleArrowForward = Builder(name = "SubtractCircleArrowForward", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 8.5f)
                curveTo(5.224f, 8.5f, 5.0f, 8.724f, 5.0f, 9.0f)
                curveTo(5.0f, 9.276f, 5.224f, 9.5f, 5.5f, 9.5f)
                horizontalLineTo(12.205f)
                curveTo(12.444f, 9.39f, 12.692f, 9.297f, 12.948f, 9.222f)
                curveTo(12.981f, 9.155f, 13.0f, 9.08f, 13.0f, 9.0f)
                curveTo(13.0f, 8.724f, 12.776f, 8.5f, 12.5f, 8.5f)
                horizontalLineTo(5.5f)
                close()
                moveTo(15.997f, 9.206f)
                curveTo(15.999f, 9.138f, 16.0f, 9.069f, 16.0f, 9.0f)
                curveTo(16.0f, 5.134f, 12.866f, 2.0f, 9.0f, 2.0f)
                curveTo(5.134f, 2.0f, 2.0f, 5.134f, 2.0f, 9.0f)
                curveTo(2.0f, 12.866f, 5.134f, 16.0f, 9.0f, 16.0f)
                curveTo(9.069f, 16.0f, 9.138f, 15.999f, 9.206f, 15.997f)
                curveTo(9.303f, 16.339f, 9.431f, 16.667f, 9.589f, 16.979f)
                curveTo(9.394f, 16.993f, 9.198f, 17.0f, 9.0f, 17.0f)
                curveTo(4.582f, 17.0f, 1.0f, 13.418f, 1.0f, 9.0f)
                curveTo(1.0f, 4.582f, 4.582f, 1.0f, 9.0f, 1.0f)
                curveTo(13.418f, 1.0f, 17.0f, 4.582f, 17.0f, 9.0f)
                curveTo(17.0f, 9.198f, 16.993f, 9.394f, 16.979f, 9.589f)
                curveTo(16.667f, 9.431f, 16.339f, 9.303f, 15.997f, 9.206f)
                close()
                moveTo(10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 12.015f, 19.0f, 14.5f, 19.0f)
                curveTo(16.985f, 19.0f, 19.0f, 16.985f, 19.0f, 14.5f)
                curveTo(19.0f, 12.015f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                close()
                moveTo(15.396f, 11.896f)
                curveTo(15.592f, 11.701f, 15.908f, 11.701f, 16.104f, 11.896f)
                lineTo(17.854f, 13.646f)
                curveTo(17.902f, 13.694f, 17.938f, 13.75f, 17.962f, 13.809f)
                curveTo(17.986f, 13.868f, 18.0f, 13.932f, 18.0f, 14.0f)
                curveTo(18.0f, 14.068f, 17.986f, 14.132f, 17.962f, 14.191f)
                curveTo(17.938f, 14.25f, 17.903f, 14.304f, 17.856f, 14.351f)
                lineTo(16.104f, 16.104f)
                curveTo(15.908f, 16.299f, 15.592f, 16.299f, 15.396f, 16.104f)
                curveTo(15.201f, 15.908f, 15.201f, 15.592f, 15.396f, 15.396f)
                lineTo(16.293f, 14.5f)
                horizontalLineTo(14.75f)
                curveTo(13.783f, 14.5f, 13.0f, 15.283f, 13.0f, 16.25f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 16.776f, 12.776f, 17.0f, 12.5f, 17.0f)
                curveTo(12.224f, 17.0f, 12.0f, 16.776f, 12.0f, 16.5f)
                verticalLineTo(16.25f)
                curveTo(12.0f, 14.731f, 13.231f, 13.5f, 14.75f, 13.5f)
                horizontalLineTo(16.293f)
                lineTo(15.396f, 12.604f)
                curveTo(15.201f, 12.408f, 15.201f, 12.092f, 15.396f, 11.896f)
                close()
            }
        }
        .build()
        return _subtractCircleArrowForward!!
    }

@Suppress("ObjectPropertyName")
private var _subtractCircleArrowForward: ImageVector? = null

@Preview
@Composable
private fun SubtractCircleArrowForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SubtractCircleArrowForward, contentDescription = "SubtractCircleArrowForward Icon")
    }
}

