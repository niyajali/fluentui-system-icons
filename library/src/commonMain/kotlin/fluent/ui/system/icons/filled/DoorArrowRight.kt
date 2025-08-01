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
 * DoorArrowRight Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used in joining meeting scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_door_arrow_right_20_filled.svg)
 * 
 * @return The [ImageVector] for the DoorArrowRight icon.
 */
public val FluentIcons.Filled.DoorArrowRight: ImageVector
    get() {
        if (_doorArrowRight != null) {
            return _doorArrowRight!!
        }
        _doorArrowRight = Builder(name = "DoorArrowRight", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 2.5f)
                curveTo(5.172f, 2.5f, 4.5f, 3.172f, 4.5f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(4.5f, 16.828f, 5.172f, 17.5f, 6.0f, 17.5f)
                horizontalLineTo(9.889f)
                curveTo(9.327f, 16.637f, 9.0f, 15.607f, 9.0f, 14.5f)
                curveTo(9.0f, 11.462f, 11.462f, 9.0f, 14.5f, 9.0f)
                curveTo(14.842f, 9.0f, 15.176f, 9.031f, 15.5f, 9.091f)
                verticalLineTo(4.0f)
                curveTo(15.5f, 3.172f, 14.828f, 2.5f, 14.0f, 2.5f)
                horizontalLineTo(6.0f)
                close()
                moveTo(8.0f, 10.0f)
                curveTo(8.0f, 10.552f, 7.552f, 11.0f, 7.0f, 11.0f)
                curveTo(6.448f, 11.0f, 6.0f, 10.552f, 6.0f, 10.0f)
                curveTo(6.0f, 9.448f, 6.448f, 9.0f, 7.0f, 9.0f)
                curveTo(7.552f, 9.0f, 8.0f, 9.448f, 8.0f, 10.0f)
                close()
                moveTo(14.5f, 19.0f)
                curveTo(16.985f, 19.0f, 19.0f, 16.985f, 19.0f, 14.5f)
                curveTo(19.0f, 12.015f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 12.015f, 19.0f, 14.5f, 19.0f)
                close()
                moveTo(14.854f, 16.854f)
                curveTo(14.658f, 17.049f, 14.342f, 17.049f, 14.146f, 16.854f)
                curveTo(13.951f, 16.658f, 13.951f, 16.342f, 14.146f, 16.146f)
                lineTo(15.293f, 15.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 15.0f, 12.0f, 14.776f, 12.0f, 14.5f)
                curveTo(12.0f, 14.224f, 12.224f, 14.0f, 12.5f, 14.0f)
                horizontalLineTo(15.293f)
                lineTo(14.146f, 12.854f)
                curveTo(13.951f, 12.658f, 13.951f, 12.342f, 14.146f, 12.146f)
                curveTo(14.342f, 11.951f, 14.658f, 11.951f, 14.854f, 12.146f)
                lineTo(16.854f, 14.146f)
                curveTo(16.902f, 14.194f, 16.938f, 14.25f, 16.962f, 14.309f)
                curveTo(16.986f, 14.367f, 17.0f, 14.43f, 17.0f, 14.497f)
                lineTo(17.0f, 14.5f)
                lineTo(17.0f, 14.503f)
                curveTo(17.0f, 14.57f, 16.986f, 14.633f, 16.962f, 14.691f)
                curveTo(16.938f, 14.75f, 16.903f, 14.804f, 16.856f, 14.851f)
                lineTo(16.853f, 14.854f)
                lineTo(14.854f, 16.854f)
                close()
            }
        }
        .build()
        return _doorArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _doorArrowRight: ImageVector? = null

@Preview
@Composable
private fun DoorArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DoorArrowRight, contentDescription = "DoorArrowRight Icon")
    }
}

