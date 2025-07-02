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
 * FolderGlobe icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: folder, globe
 * - Source: ic_fluent_folder_globe_20_regular.svg
 * 
 * @return The [ImageVector] for the FolderGlobe icon.
 */
public val FluentIcons.Regular.FolderGlobe: ImageVector
    get() {
        if (_folderGlobe != null) {
            return _folderGlobe!!
        }
        _folderGlobe = Builder(name = "FolderGlobe", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 3.0f)
                curveTo(3.119f, 3.0f, 2.0f, 4.119f, 2.0f, 5.5f)
                verticalLineTo(14.5f)
                curveTo(2.0f, 15.881f, 3.119f, 17.0f, 4.5f, 17.0f)
                horizontalLineTo(9.6f)
                curveTo(9.438f, 16.683f, 9.306f, 16.349f, 9.207f, 16.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 16.0f, 3.0f, 15.328f, 3.0f, 14.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.086f)
                curveTo(7.484f, 8.0f, 7.865f, 7.842f, 8.146f, 7.561f)
                lineTo(9.707f, 6.0f)
                horizontalLineTo(15.5f)
                curveTo(16.328f, 6.0f, 17.0f, 6.672f, 17.0f, 7.5f)
                verticalLineTo(9.6f)
                curveTo(17.358f, 9.783f, 17.693f, 10.003f, 18.0f, 10.257f)
                verticalLineTo(7.5f)
                curveTo(18.0f, 6.119f, 16.881f, 5.0f, 15.5f, 5.0f)
                horizontalLineTo(9.707f)
                lineTo(8.22f, 3.513f)
                curveTo(7.891f, 3.184f, 7.446f, 3.0f, 6.982f, 3.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(3.0f, 5.5f)
                curveTo(3.0f, 4.672f, 3.672f, 4.0f, 4.5f, 4.0f)
                horizontalLineTo(6.982f)
                curveTo(7.181f, 4.0f, 7.372f, 4.079f, 7.513f, 4.22f)
                lineTo(8.793f, 5.5f)
                lineTo(7.439f, 6.854f)
                curveTo(7.346f, 6.947f, 7.218f, 7.0f, 7.086f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.5f)
                close()
                moveTo(13.55f, 11.15f)
                curveTo(13.259f, 11.877f, 13.057f, 12.872f, 13.01f, 14.0f)
                horizontalLineTo(15.99f)
                curveTo(15.943f, 12.872f, 15.741f, 11.877f, 15.45f, 11.15f)
                curveTo(15.283f, 10.733f, 15.097f, 10.428f, 14.915f, 10.236f)
                curveTo(14.735f, 10.046f, 14.594f, 10.0f, 14.5f, 10.0f)
                curveTo(14.406f, 10.0f, 14.265f, 10.046f, 14.085f, 10.236f)
                curveTo(13.903f, 10.428f, 13.717f, 10.733f, 13.55f, 11.15f)
                close()
                moveTo(12.829f, 10.32f)
                curveTo(12.755f, 10.465f, 12.685f, 10.619f, 12.621f, 10.779f)
                curveTo(12.277f, 11.641f, 12.057f, 12.766f, 12.009f, 14.0f)
                horizontalLineTo(10.027f)
                curveTo(10.213f, 12.323f, 11.319f, 10.924f, 12.829f, 10.32f)
                close()
                moveTo(16.17f, 10.32f)
                curveTo(16.245f, 10.465f, 16.314f, 10.619f, 16.378f, 10.779f)
                curveTo(16.723f, 11.641f, 16.943f, 12.766f, 16.99f, 14.0f)
                horizontalLineTo(18.972f)
                curveTo(18.787f, 12.323f, 17.681f, 10.924f, 16.17f, 10.32f)
                close()
                moveTo(18.972f, 15.0f)
                horizontalLineTo(16.99f)
                curveTo(16.943f, 16.234f, 16.723f, 17.359f, 16.378f, 18.221f)
                curveTo(16.314f, 18.381f, 16.245f, 18.535f, 16.17f, 18.68f)
                curveTo(17.681f, 18.076f, 18.787f, 16.677f, 18.972f, 15.0f)
                close()
                moveTo(14.5f, 19.0f)
                curveTo(14.594f, 19.0f, 14.735f, 18.954f, 14.915f, 18.764f)
                curveTo(15.097f, 18.572f, 15.283f, 18.267f, 15.45f, 17.85f)
                curveTo(15.741f, 17.123f, 15.943f, 16.128f, 15.99f, 15.0f)
                horizontalLineTo(13.01f)
                curveTo(13.057f, 16.128f, 13.259f, 17.123f, 13.55f, 17.85f)
                curveTo(13.717f, 18.267f, 13.903f, 18.572f, 14.085f, 18.764f)
                curveTo(14.265f, 18.954f, 14.406f, 19.0f, 14.5f, 19.0f)
                close()
                moveTo(12.829f, 18.68f)
                curveTo(11.319f, 18.076f, 10.213f, 16.677f, 10.027f, 15.0f)
                horizontalLineTo(12.009f)
                curveTo(12.057f, 16.234f, 12.277f, 17.359f, 12.621f, 18.221f)
                curveTo(12.685f, 18.381f, 12.755f, 18.535f, 12.829f, 18.68f)
                close()
            }
        }
        .build()
        return _folderGlobe!!
    }

@Suppress("ObjectPropertyName")
private var _folderGlobe: ImageVector? = null

@Preview
@Composable
private fun FolderGlobePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FolderGlobe, contentDescription = null)
    }
}

