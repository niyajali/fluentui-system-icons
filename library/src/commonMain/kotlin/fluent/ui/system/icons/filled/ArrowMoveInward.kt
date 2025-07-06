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

package fluent.ui.system.icons.filled

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
 * ArrowMoveInward Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: 
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_move_inward_20_filled.svg)
 * 
 * @return The [ImageVector] for the ArrowMoveInward icon.
 */
public val FluentIcons.Filled.ArrowMoveInward: ImageVector
    get() {
        if (_arrowMoveInward != null) {
            return _arrowMoveInward!!
        }
        _arrowMoveInward = Builder(name = "ArrowMoveInward", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.03f, 3.72f)
                curveTo(13.323f, 4.013f, 13.323f, 4.487f, 13.03f, 4.78f)
                lineTo(10.53f, 7.28f)
                curveTo(10.237f, 7.573f, 9.763f, 7.573f, 9.47f, 7.28f)
                lineTo(6.97f, 4.78f)
                curveTo(6.677f, 4.487f, 6.677f, 4.013f, 6.97f, 3.72f)
                curveTo(7.263f, 3.427f, 7.737f, 3.427f, 8.03f, 3.72f)
                lineTo(9.25f, 4.939f)
                verticalLineTo(1.75f)
                curveTo(9.25f, 1.336f, 9.586f, 1.0f, 10.0f, 1.0f)
                curveTo(10.414f, 1.0f, 10.75f, 1.336f, 10.75f, 1.75f)
                verticalLineTo(4.939f)
                lineTo(11.97f, 3.72f)
                curveTo(12.263f, 3.427f, 12.737f, 3.427f, 13.03f, 3.72f)
                close()
                moveTo(3.72f, 6.97f)
                curveTo(4.013f, 6.677f, 4.487f, 6.677f, 4.78f, 6.97f)
                lineTo(7.28f, 9.47f)
                curveTo(7.573f, 9.763f, 7.573f, 10.237f, 7.28f, 10.53f)
                lineTo(4.78f, 13.03f)
                curveTo(4.487f, 13.323f, 4.013f, 13.323f, 3.72f, 13.03f)
                curveTo(3.427f, 12.737f, 3.427f, 12.263f, 3.72f, 11.97f)
                lineTo(4.939f, 10.75f)
                horizontalLineTo(1.75f)
                curveTo(1.336f, 10.75f, 1.0f, 10.414f, 1.0f, 10.0f)
                curveTo(1.0f, 9.586f, 1.336f, 9.25f, 1.75f, 9.25f)
                horizontalLineTo(4.939f)
                lineTo(3.72f, 8.03f)
                curveTo(3.427f, 7.737f, 3.427f, 7.263f, 3.72f, 6.97f)
                close()
                moveTo(15.22f, 6.97f)
                curveTo(15.513f, 6.677f, 15.987f, 6.677f, 16.28f, 6.97f)
                curveTo(16.573f, 7.263f, 16.573f, 7.737f, 16.28f, 8.03f)
                lineTo(15.061f, 9.25f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 9.25f, 19.0f, 9.586f, 19.0f, 10.0f)
                curveTo(19.0f, 10.414f, 18.664f, 10.75f, 18.25f, 10.75f)
                horizontalLineTo(15.061f)
                lineTo(16.28f, 11.97f)
                curveTo(16.573f, 12.263f, 16.573f, 12.737f, 16.28f, 13.03f)
                curveTo(15.987f, 13.323f, 15.513f, 13.323f, 15.22f, 13.03f)
                lineTo(12.72f, 10.53f)
                curveTo(12.427f, 10.237f, 12.427f, 9.763f, 12.72f, 9.47f)
                lineTo(15.22f, 6.97f)
                close()
                moveTo(13.03f, 16.28f)
                curveTo(13.323f, 15.987f, 13.323f, 15.513f, 13.03f, 15.22f)
                lineTo(10.53f, 12.72f)
                curveTo(10.237f, 12.427f, 9.763f, 12.427f, 9.47f, 12.72f)
                lineTo(6.97f, 15.22f)
                curveTo(6.677f, 15.513f, 6.677f, 15.987f, 6.97f, 16.28f)
                curveTo(7.263f, 16.573f, 7.737f, 16.573f, 8.03f, 16.28f)
                lineTo(9.25f, 15.061f)
                verticalLineTo(18.25f)
                curveTo(9.25f, 18.664f, 9.586f, 19.0f, 10.0f, 19.0f)
                curveTo(10.414f, 19.0f, 10.75f, 18.664f, 10.75f, 18.25f)
                verticalLineTo(15.061f)
                lineTo(11.97f, 16.28f)
                curveTo(12.263f, 16.573f, 12.737f, 16.573f, 13.03f, 16.28f)
                close()
            }
        }
        .build()
        return _arrowMoveInward!!
    }

@Suppress("ObjectPropertyName")
private var _arrowMoveInward: ImageVector? = null

@Preview
@Composable
private fun ArrowMoveInwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowMoveInward, contentDescription = "ArrowMoveInward Icon")
    }
}

