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
 * DeveloperBoardLightningToolbox icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: developer, board, lightning, toolbox
 * - Source: ic_fluent_developer_board_lightning_toolbox_20_regular.svg
 * 
 * @return The [ImageVector] for the DeveloperBoardLightningToolbox icon.
 */
public val FluentIcons.Regular.DeveloperBoardLightningToolbox: ImageVector
    get() {
        if (_developerBoardLightningToolbox != null) {
            return _developerBoardLightningToolbox!!
        }
        _developerBoardLightningToolbox = Builder(name = "DeveloperBoardLightningToolbox", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 2.0f)
                curveTo(7.776f, 2.0f, 8.0f, 2.224f, 8.0f, 2.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(2.5f)
                curveTo(9.5f, 2.224f, 9.724f, 2.0f, 10.0f, 2.0f)
                curveTo(10.276f, 2.0f, 10.5f, 2.224f, 10.5f, 2.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.5f)
                curveTo(12.0f, 2.224f, 12.224f, 2.0f, 12.5f, 2.0f)
                curveTo(12.776f, 2.0f, 13.0f, 2.224f, 13.0f, 2.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.5f)
                curveTo(14.881f, 4.0f, 16.0f, 5.119f, 16.0f, 6.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 7.0f, 18.0f, 7.224f, 18.0f, 7.5f)
                curveTo(18.0f, 7.776f, 17.776f, 8.0f, 17.5f, 8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.05f)
                curveTo(15.838f, 9.017f, 15.671f, 9.0f, 15.5f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.5f)
                curveTo(15.0f, 5.672f, 14.328f, 5.0f, 13.5f, 5.0f)
                horizontalLineTo(6.5f)
                curveTo(5.672f, 5.0f, 5.0f, 5.672f, 5.0f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(5.0f, 14.328f, 5.672f, 15.0f, 6.5f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.5f)
                curveTo(8.0f, 17.776f, 7.776f, 18.0f, 7.5f, 18.0f)
                curveTo(7.224f, 18.0f, 7.0f, 17.776f, 7.0f, 17.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 16.0f, 4.0f, 14.881f, 4.0f, 13.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 13.0f, 2.0f, 12.776f, 2.0f, 12.5f)
                curveTo(2.0f, 12.224f, 2.224f, 12.0f, 2.5f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 10.5f, 2.0f, 10.276f, 2.0f, 10.0f)
                curveTo(2.0f, 9.724f, 2.224f, 9.5f, 2.5f, 9.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 8.0f, 2.0f, 7.776f, 2.0f, 7.5f)
                curveTo(2.0f, 7.224f, 2.224f, 7.0f, 2.5f, 7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.5f)
                curveTo(4.0f, 5.119f, 5.119f, 4.0f, 6.5f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.5f)
                curveTo(7.0f, 2.224f, 7.224f, 2.0f, 7.5f, 2.0f)
                close()
                moveTo(11.042f, 11.042f)
                curveTo(11.192f, 10.232f, 11.732f, 9.56f, 12.459f, 9.226f)
                curveTo(12.397f, 9.097f, 12.267f, 9.0f, 12.099f, 9.0f)
                lineTo(10.57f, 9.0f)
                lineTo(10.986f, 7.54f)
                curveTo(11.11f, 7.104f, 10.551f, 6.807f, 10.26f, 7.155f)
                lineTo(7.592f, 10.343f)
                curveTo(7.375f, 10.604f, 7.56f, 11.0f, 7.899f, 11.0f)
                lineTo(9.456f, 11.0f)
                lineTo(9.023f, 12.458f)
                curveTo(8.979f, 12.605f, 9.014f, 12.736f, 9.09f, 12.833f)
                curveTo(9.342f, 11.92f, 10.099f, 11.217f, 11.042f, 11.042f)
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
                moveTo(17.0f, 16.5f)
                verticalLineTo(16.0f)
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
                close()
            }
        }
        .build()
        return _developerBoardLightningToolbox!!
    }

@Suppress("ObjectPropertyName")
private var _developerBoardLightningToolbox: ImageVector? = null

@Preview
@Composable
private fun DeveloperBoardLightningToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DeveloperBoardLightningToolbox, contentDescription = null)
    }
}

