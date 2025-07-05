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
 * WrenchScrewdriver Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general maintenance & tooling scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_wrench_screwdriver_24_regular.svg)
 * 
 * @return The [ImageVector] for the WrenchScrewdriver icon.
 */
public val FluentIcons.Regular.WrenchScrewdriver: ImageVector
    get() {
        if (_wrenchScrewdriver != null) {
            return _wrenchScrewdriver!!
        }
        _wrenchScrewdriver = Builder(name = "WrenchScrewdriver", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.25f, 2.0f)
                curveTo(15.966f, 2.0f, 15.706f, 2.161f, 15.579f, 2.415f)
                lineTo(14.579f, 4.415f)
                curveTo(14.467f, 4.639f, 14.474f, 4.904f, 14.599f, 5.122f)
                lineTo(15.5f, 6.699f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.75f)
                curveTo(14.336f, 12.0f, 14.0f, 12.336f, 14.0f, 12.75f)
                verticalLineTo(18.5f)
                curveTo(14.0f, 20.433f, 15.567f, 22.0f, 17.5f, 22.0f)
                curveTo(19.433f, 22.0f, 21.0f, 20.433f, 21.0f, 18.5f)
                verticalLineTo(12.75f)
                curveTo(21.0f, 12.336f, 20.664f, 12.0f, 20.25f, 12.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.699f)
                lineTo(20.401f, 5.122f)
                curveTo(20.526f, 4.904f, 20.533f, 4.639f, 20.421f, 4.415f)
                lineTo(19.421f, 2.415f)
                curveTo(19.294f, 2.161f, 19.034f, 2.0f, 18.75f, 2.0f)
                horizontalLineTo(16.25f)
                close()
                moveTo(18.0f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.5f)
                curveTo(17.0f, 6.369f, 16.966f, 6.241f, 16.901f, 6.128f)
                lineTo(16.1f, 4.726f)
                lineTo(16.713f, 3.5f)
                horizontalLineTo(18.287f)
                lineTo(18.9f, 4.726f)
                lineTo(18.099f, 6.128f)
                curveTo(18.034f, 6.241f, 18.0f, 6.369f, 18.0f, 6.5f)
                verticalLineTo(12.0f)
                close()
                moveTo(15.5f, 18.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(18.5f)
                curveTo(19.5f, 19.605f, 18.605f, 20.5f, 17.5f, 20.5f)
                curveTo(16.395f, 20.5f, 15.5f, 19.605f, 15.5f, 18.5f)
                close()
                moveTo(19.5f, 14.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(14.5f)
                close()
                moveTo(9.526f, 2.136f)
                curveTo(9.295f, 2.044f, 9.034f, 2.073f, 8.828f, 2.212f)
                curveTo(8.623f, 2.352f, 8.5f, 2.584f, 8.5f, 2.833f)
                verticalLineTo(6.5f)
                curveTo(8.5f, 7.052f, 8.052f, 7.5f, 7.5f, 7.5f)
                curveTo(6.948f, 7.5f, 6.5f, 7.052f, 6.5f, 6.5f)
                verticalLineTo(2.833f)
                curveTo(6.5f, 2.584f, 6.377f, 2.352f, 6.171f, 2.212f)
                curveTo(5.966f, 2.073f, 5.704f, 2.044f, 5.473f, 2.136f)
                curveTo(3.44f, 2.942f, 2.0f, 4.927f, 2.0f, 7.25f)
                curveTo(2.0f, 9.374f, 3.204f, 11.215f, 4.964f, 12.132f)
                verticalLineTo(19.464f)
                curveTo(4.964f, 20.865f, 6.1f, 22.0f, 7.5f, 22.0f)
                curveTo(8.9f, 22.0f, 10.036f, 20.865f, 10.036f, 19.464f)
                verticalLineTo(12.132f)
                curveTo(11.796f, 11.215f, 13.0f, 9.374f, 13.0f, 7.25f)
                curveTo(13.0f, 4.927f, 11.56f, 2.942f, 9.526f, 2.136f)
                close()
                moveTo(10.0f, 6.5f)
                verticalLineTo(4.127f)
                curveTo(10.915f, 4.861f, 11.5f, 5.987f, 11.5f, 7.25f)
                curveTo(11.5f, 8.926f, 10.469f, 10.363f, 9.004f, 10.958f)
                curveTo(8.721f, 11.073f, 8.536f, 11.348f, 8.536f, 11.653f)
                verticalLineTo(19.464f)
                curveTo(8.536f, 20.036f, 8.072f, 20.5f, 7.5f, 20.5f)
                curveTo(6.928f, 20.5f, 6.464f, 20.036f, 6.464f, 19.464f)
                verticalLineTo(11.653f)
                curveTo(6.464f, 11.348f, 6.279f, 11.073f, 5.996f, 10.958f)
                curveTo(4.531f, 10.363f, 3.5f, 8.926f, 3.5f, 7.25f)
                curveTo(3.5f, 5.988f, 4.085f, 4.861f, 5.0f, 4.127f)
                verticalLineTo(6.5f)
                curveTo(5.0f, 7.881f, 6.119f, 9.0f, 7.5f, 9.0f)
                curveTo(8.881f, 9.0f, 10.0f, 7.881f, 10.0f, 6.5f)
                close()
            }
        }
        .build()
        return _wrenchScrewdriver!!
    }

@Suppress("ObjectPropertyName")
private var _wrenchScrewdriver: ImageVector? = null

@Preview
@Composable
private fun WrenchScrewdriverPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WrenchScrewdriver, contentDescription = "WrenchScrewdriver Icon")
    }
}

